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

class Element(val name: String, val node: Node) {
	lateinit var complex: ComplexType

	val className get() = "Element${name.formatToPascal()}"
	private val methodName
		get() =
			if (name == "cite" || name == "abbr") "${name}Element" // ugly hack to fix attribute/element collision issue
			else cleanKeyword(name.formatToCamel())

	fun writeVal(writer: IndentedWriter) = writer.run {
		writeln("val $methodName: $className")
	}

	fun writeImpl(writer: IndentedWriter, hasInterface: Boolean) = writer.run {
		writeln("${if (hasInterface) "override " else ""}val $methodName get() = $className(DomElementImpl(dom))")
	}

	fun writeClass(writer: IndentedWriter) = writer.run {
		writeAnnotation(node)
		val delegates = complex.delegates + "DomElement"
		writeln("class $className(internal val dom: DomElementImpl) : ${delegates.joinToString()} {")
		indented {
			writeln("init {")
			indented {
				writeln("dom.element = this")
			}
			writeln("}")
			writeln()
			writeln("override val elementName = \"$name\"")
			writeln()
			writeln("fun write(writer: KingdomWriter) = dom.write(writer)")
			writeln()
			val args = mutableListOf<String>()
			val attributes = complex.findAttributes()
			for (attr in attributes) args += "${attr.varName}: ${attr.inputType}? = null"
			args += "fn: $className.() -> Unit = {}"
			writeln("inline operator fun invoke(${args.joinToString()}): $className {")
			indented {
				for (attr in attributes) {
					writeln("if (${attr.varName} != null) this.${attr.varName} = ${attr.mangleInput(attr.varName)}")
				}
				writeln("fn(this)")
				writeln("return this")
			}
			writeln("}")
			writeln()
			writeln("inline operator fun invoke(fn: $className.() -> Unit) = apply(fn)")
			writeln()
			complex.writeFunsImpl(this, false, className)
		}
		writeln("}")
	}
}

