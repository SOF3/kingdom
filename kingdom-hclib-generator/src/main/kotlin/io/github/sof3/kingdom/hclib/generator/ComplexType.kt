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

class ComplexType {
	val attributes = mutableMapOf<String, Attribute>()
	val attributeGroups = mutableMapOf<String, AttributeGroup>()
	val groups = mutableMapOf<String, Group>()
	val children = mutableMapOf<String, Element>()
	var parentName: String? = null
	var mixed = false

	val parent get() = if (parentName != null) ParsedModel.complexTypes[parentName!!]!! else null

	val extends
		get() = attributeGroups.map { it.value.interfaceName } +
				groups.map { it.value.interfaceName } +
				if (parentName != null) listOf(parentName!!) else emptyList()

	val delegates: List<String>
		get() {
			val ret = mutableListOf<String>()
			parentName.ifNotNull { ret += "$it by ${parentName}Impl(dom)" }
			for ((_, group) in attributeGroups) ret += "${group.interfaceName} by ${group.className}(dom)"
			for ((_, group) in groups) ret += "${group.interfaceName} by ${group.className}(dom)"
			return ret
		}

	fun findAttributes(list: MutableList<Attribute> = mutableListOf()): List<Attribute> {
		for ((_, attrGroup) in attributeGroups) attrGroup.findAttributes(list)
		for ((_, attr) in attributes) list += attr
		if (parentName != null) parent!!.findAttributes(list)

		return list
	}

	fun anyAncestor(predicate: (ComplexType) -> Boolean): Boolean {
		val parent = parent
		if (parent != null) {
			if (predicate(parent)) return true
			return parent.anyAncestor(predicate)
		}
		return false
	}

	fun writeInterface(name: String, writer: IndentedWriter) = writer.run {
		writeln("interface $name ${toExtendsList(extends)}{")
		indented {
			writeFuns(name, this)
		}
		writeln("}")
	}

	fun writeClass(name: String, writer: IndentedWriter) = writer.run {
		val delegates = this@ComplexType.delegates + name
		writeln("class ${name}Impl(private val dom: DomElementImpl) : ${delegates.joinToString()} {")
		indented {
			writeFunsImpl(this, true)
		}
		writeln("}")
	}

	fun writeFuns(thisName: String, writer: IndentedWriter) = writer.run {
		for ((_, attribute) in attributes) {
			attribute.writeVar(this)
		}
		writeln()
		for ((_, child) in children) {
			child.writeVal(this)
		}
		writeln()
		if (mixed && !anyAncestor { it.mixed }) {
			writeln("operator fun String.unaryPlus(): $thisName {")
			indented {
				writeln("plusAssign(this)")
				writeln("return this@$thisName")
			}
			writeln("}")
			writeln()
			writeln("operator fun plusAssign(string: String)")
		}
	}

	fun writeFunsImpl(writer: IndentedWriter, hasInterface: Boolean) = writer.run {
		for ((_, attribute) in attributes) {
			attribute.writeImpl(this, hasInterface)
		}
		writeln()
		for ((_, child) in children) {
			child.writeImpl(this, hasInterface)
		}
		writeln()
		if (mixed && !anyAncestor { it.mixed }) {
			writeln("${if(hasInterface) "override" else "operator"} fun plusAssign(string: String){")
			indented {
				writeln("dom.addPlain(string)")
			}
			writeln("}")
		}
	}

	fun parseNode(type: Node) {
		type.children("attribute") {
			if (it["name"] != null) {
				attributes[it["name"]!!] = Attribute(it)
			}
		}
		type.children("attributeGroup") {
			if (it["ref"] != null) {
				val group = ParsedModel.attrGroups[it["ref"]!!]!!
				attributeGroups[group.name] = group
			}
		}
		type.dfs(setOf("choice", "sequence"), setOf("group", "element")) {
			when (it.localName) {
				"group" -> {
					val group = ParsedModel.groups[it["ref"]!!]!!
					groups[group.name] = group
				}
				"element" -> {
					val element = (
							if (it["ref"] != null) ParsedModel.elements[it["ref"]!!]!!
							else Element(it["name"]!!, it))
					children[element.name] = element
				}
			}
		}
	}
}

fun iOverride(hasInterface: Boolean) = if(hasInterface) "override " else ""
