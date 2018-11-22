package io.github.sof3.kingdom.hclib.generator

import org.apache.commons.io.IOUtils
import org.w3c.dom.Node
import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter
import java.net.URL
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.system.measureTimeMillis


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

const val XHTML_SCHEMA_ONLINE = "https://www.w3.org/2002/08/xhtml/xhtml1-strict.xsd"
val CACHE_DIR = File("cache")
val HTML_OUT_DIR = File("../kingdom-generated-hclib/src/main/kotlin/io/github/sof3/kingdom/hclib/html")
val XHTML_SCHEMA_OFFLINE = File(CACHE_DIR, "xhtml1-strict.xsd")

const val XS_URI = "http://www.w3.org/2001/XMLSchema"

object Config {
	var lineSeparator = "\n"
	var indent = "\t"
}

object ParsedModel {
	val simpleTypes = SimpleTypes()
	val attrGroups = mutableMapOf<String, AttributeGroup>()
	val elements = mutableMapOf<String, Element>()
	val groups = mutableMapOf<String, Group>()
	val complexTypes = mutableMapOf<String, ComplexType>() // only named complexTypes are stored here
}

fun main(args: Array<String>) = task("Executing", big = true) {
	if (!XHTML_SCHEMA_OFFLINE.isFile) {
		task("Downloading xhtml1-strict.xsd for the first time") {
			if (!CACHE_DIR.isDirectory) CACHE_DIR.mkdirs()
			URL(XHTML_SCHEMA_ONLINE).openStream().use { dl ->
				FileOutputStream(XHTML_SCHEMA_OFFLINE).use { fw ->
					IOUtils.copyLarge(dl, fw)
				}
			}
		}
	}

	task("Cleaning up") {
		if (HTML_OUT_DIR.isDirectory) HTML_OUT_DIR.deleteRecursively()
		HTML_OUT_DIR.mkdirs()
	}

	lateinit var schema: Node
	task("Parsing xhtml1-strict.xsd") {
		val doc = DocumentBuilderFactory.newInstance().apply {
			isNamespaceAware = true
		}.newDocumentBuilder().parse(XHTML_SCHEMA_OFFLINE)
		schema = doc.documentElement
	}

	task("Extracting simpleType nodes") {
		schema.children("simpleType") { ParsedModel.simpleTypes.add(it, "Simple", it) }
	}

	task("Extracting attributeGroup nodes") {
		schema.children("attributeGroup") { grp ->
			val attrGroup = AttributeGroup(grp["name"]!!, grp)
			grp.children("attribute") { attr ->
				val attrName = attr["name"]
				if (attrName != null) {
					attrGroup.attributes += Attribute(attr)
				}
			}
			ParsedModel.attrGroups[attrGroup.name] = attrGroup
		}
	}

	task("Linking attributeGroup nodes") {
		for ((_, ag) in ParsedModel.attrGroups) {
			ag.node.children("attributeGroup") {
				ag.attributeGroups += ParsedModel.attrGroups[it["ref"]!!]!!
			}
		}
	}

	task("Extracting element nodes") {
		schema.children("element") { el ->
			val element = Element(el["name"]!!, el)
			ParsedModel.elements[element.name] = element
		}
	}

	task("Extracting group nodes") {
		schema.children("group") { grp ->
			val group = Group(grp["name"]!!, grp)
			ParsedModel.groups[group.name] = group
		}
	}

	task("Extracting and linking complexType nodes") {
		schema.children("complexType") { type ->
			val complex = ComplexType()
			complex.mixed = type["mixed"] == "true"

			var parsed = type
			type.firstChild("complexContent") { cc ->
				cc.firstChild("extension") { ext ->
					val base = ext["base"]!!
					complex.parentName = "Complex" + base.formatToPascal()
					parsed = ext
				}
			}

			complex.parseNode(parsed)
			ParsedModel.complexTypes["Complex" + type["name"]!!.formatToPascal()] = complex
		}
	}

	task("Linking group nodes") {
		for ((_, group) in ParsedModel.groups) {
			group.node.dfs(setOf("choice", "sequence"), setOf("group", "element")) {
				when (it.localName) {
					"group" -> group.groupRefs += ParsedModel.groups[it["ref"]!!]!!
					"element" -> group.elementRefs += ParsedModel.elements[it["ref"]!!]!!
				}
			}
		}
	}

	task("Linking element nodes") {
		for ((_, element) in ParsedModel.elements) {
			val node = element.node
			val complex = ComplexType()
			element.complex = complex

			var type = node.firstChild("complexType")!!
			complex.mixed = type["mixed"] == "true"

			type.firstChild("complexContent") { cc ->
				cc.firstChild("extension") { ext ->
					complex.parentName = "Complex" + ext["base"]!!.formatToPascal()
					type = ext
				}
			}

			complex.parseNode(type)
		}
	}

	task("Generating simpleType files") {
		for ((name, type) in ParsedModel.simpleTypes.types) {
			FileWriter(File(HTML_OUT_DIR, "$name.kt")).indentedWriter {
				writeStandardHeader()
				for (import in type.imports) writeln("import $import")
				writeln()
				type.fn(this)
			}
		}
	}

	task("Generating attributeGroup API") {
		for ((_, group) in ParsedModel.attrGroups) {
			FileWriter(File(HTML_OUT_DIR, "${group.interfaceName}.kt")).indentedWriter {
				writeStandardHeader()
				writeln()
				group.writeInterface(this)
			}
		}
	}
	task("Generating attributeGroup implementation") {
		for ((_, group) in ParsedModel.attrGroups) {
			FileWriter(File(HTML_OUT_DIR, "${group.className}.kt")).indentedWriter {
				writeStandardHeader()
				writeln()
				group.writeClass(this)
			}
		}
	}

	task("Generating group API") {
		for ((_, group) in ParsedModel.groups) {
			FileWriter(File(HTML_OUT_DIR, "${group.interfaceName}.kt")).indentedWriter {
				writeStandardHeader()
				writeln()
				group.writeInterface(this)
			}
		}
	}
	task("Generating group implementation") {
		for ((_, group) in ParsedModel.groups) {
			FileWriter(File(HTML_OUT_DIR, "${group.className}.kt")).indentedWriter {
				writeStandardHeader()
				writeln()
				group.writeClass(this)
			}
		}
	}

	task("Generating element classes") {
		for ((_, element) in ParsedModel.elements) {
			FileWriter(File(HTML_OUT_DIR, "${element.className}.kt")).indentedWriter {
				writeStandardHeader()
				writeln("import io.github.sof3.kingdom.hclib.KingdomWriter")
				writeln()
				element.writeClass(this)
			}
		}
	}

	task("Generating complexType API") {
		for ((name, complex) in ParsedModel.complexTypes) {
			FileWriter(File(HTML_OUT_DIR, "$name.kt")).indentedWriter {
				writeStandardHeader()
				writeln()
				complex.writeInterface(name, this)
			}
		}
	}
	task("Generating complexType implementation") {
		for ((name, complex) in ParsedModel.complexTypes) {
			FileWriter(File(HTML_OUT_DIR, "${name}Impl.kt")).indentedWriter {
				writeStandardHeader()
				writeln()
				complex.writeClass(name, this)
			}
		}
	}

	println("Done!")
	println("Generated ${ParsedModel.simpleTypes.types.size} simple types")
	println("Generated ${ParsedModel.attrGroups.size} attribute groups")
	println("Generated ${ParsedModel.groups.size} groups")
	println("Generated ${ParsedModel.elements.size} elements")
	println("Generated ${ParsedModel.complexTypes.size} named complex types")
}

inline fun task(name: String, big: Boolean = false, fn: () -> Unit) {
	print(if (big) "$name\n" else "$name... ")
	val time = measureTimeMillis(fn)
	println("Took $time ms")
}

fun cleanKeyword(name: String) = when (name) {
	"class" -> "classes"
	"var" -> "variable"
	"object" -> "obj"
	"for" -> "forTarget"
	else -> name
}

fun toExtendsList(list: List<String>) =
		if (list.isEmpty()) ""
		else list.toSet().joinToString(prefix = ": ", postfix = " ")
