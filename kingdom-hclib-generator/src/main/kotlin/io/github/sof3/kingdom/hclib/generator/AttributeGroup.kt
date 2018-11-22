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

class AttributeGroup(val name: String, val node: Node) {
	val attributes = mutableListOf<Attribute>()
	val attributeGroups = mutableListOf<AttributeGroup>()

	val interfaceName get() = "AttrGroup${name.formatToPascal()}"
	val className get() = "AttrGroup${name.formatToPascal()}Impl"

	fun writeInterface(writer: IndentedWriter) = writer.run {
		writeAnnotation(node)
		writeln("interface $interfaceName ${toExtendsList(attributeGroups.map { it.interfaceName } + "DomAttributeGroup")}{")
		indented {
			for (attribute in attributes) {
				writeAnnotation(node)
				attribute.writeVar(this)
			}
		}
		writeln("}")
	}

	fun writeClass(writer: IndentedWriter) = writer.run {
		val delegates = mutableListOf(interfaceName)
		for (group in attributeGroups) {
			delegates += "${group.interfaceName} by ${group.className}(dom)"
		}
		writeln("class $className(private val dom: DomElementImpl) : ${delegates.joinToString()}, DomAttributeGroup by DomAttributeGroupImpl(dom) {")
		indented {
			for (attribute in attributes) {
				attribute.writeImpl(this, true)
			}
		}
		writeln("}")
	}


	fun findAttributes(list: MutableList<Attribute> = mutableListOf()): List<Attribute> {
		for (group in attributeGroups) group.findAttributes(list)
		for (attribute in attributes) list += attribute
		return list
	}
}
