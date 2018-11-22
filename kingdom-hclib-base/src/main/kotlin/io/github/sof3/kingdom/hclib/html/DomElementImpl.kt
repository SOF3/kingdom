package io.github.sof3.kingdom.hclib.html

import io.github.sof3.kingdom.hclib.KingdomWriter
import org.apache.commons.text.StringEscapeUtils

/*
 *  kingdom
 *  Copyright (C) 2018 SOFe
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

class DomElementImpl(parent: DomElementImpl?) {
	lateinit var element: DomElement
	val attributes = mutableMapOf<String, String>()
	val nodes = mutableListOf<(KingdomWriter) -> Unit>()

	init {
		parent?.addChild(this)
	}

	fun addChild(child: DomElementImpl) {
		nodes += { child.write(it) }
	}

	fun addRaw(escaped: String) {
		nodes += { it.writeLine(escaped, doNewLine = false) }
	}

	fun addPlain(unescaped: String) = addRaw(StringEscapeUtils.escapeHtml4(unescaped)
			.replace("  ", "&nbsp; ")
			.replace("  ", " &nbsp;")) // second replace needed for odd number of consecutive spaces

	fun write(writer: KingdomWriter) {
		val attributeTokens = mutableListOf<String?>()
		for ((name, value) in attributes) {
			attributeTokens += listOf(null, name, "=", "\"${StringEscapeUtils.escapeHtml4(value)}\"")
		}
		if (nodes.isEmpty()) {
			writer.writeLine("<", element.elementName, *attributeTokens.toTypedArray(), "/>")
		} else {
			writer.writeLine("<", element.elementName, *attributeTokens.toTypedArray(), ">")
			if (element.elementName == "pre") {
				writer.unindented { nodes.forEach { it(writer) } }
			} else {
				writer.indented { nodes.forEach { it(writer) } }
			}
			writer.writeLine("</", element.elementName, ">")
		}
	}
}
