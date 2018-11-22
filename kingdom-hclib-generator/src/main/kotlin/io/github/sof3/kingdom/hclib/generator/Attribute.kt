package io.github.sof3.kingdom.hclib.generator

import org.w3c.dom.Node

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

class Attribute(val node: Node) {
	val name = node["name"]!!
	val type = node["type"].let { type ->
		if (type != null)
			if (type.startsWith("xs:")) {
				val name = type.substring(3)
				ParsedModel.simpleTypes.xs(name).type
			} else "Simple${type.formatToPascal()}"
		else (node.firstChild("simpleType") {
			ParsedModel.simpleTypes.add(it, "AttrType", node.parentNode.parentNode, node.parentNode, node)
		} or { "String" }).r!!
	}

	val default = node["default"]
	val varName get() = cleanKeyword(name.formatToCamel())
	val simpleType by lazy { ParsedModel.simpleTypes.types[type] }

	val inputType get() = simpleType?.inputType ?: type

	fun writeVar(writer: IndentedWriter) = writer.run {
		writeln("var $varName: $type?")
	}

	fun writeImpl(writer: IndentedWriter, hasInterface: Boolean) = writer.run {
		val d = if (default == null) "null as $type?" else when {
			simpleType != null -> simpleType!!.default(default)
			type == "String" -> "\"$default\""
			type == "Int" -> default
			else -> "\"$default\""
		}

		writeln("${if (hasInterface) "override " else ""}var $varName: $type? by DomAttributeAdapter(\"$name\", dom, $d)")
	}

	fun mangleInput(inputVar: String): String = simpleType?.mangleInput?.invoke(inputVar) ?: inputVar
}
