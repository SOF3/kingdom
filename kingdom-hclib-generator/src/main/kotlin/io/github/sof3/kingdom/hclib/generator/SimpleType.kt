package io.github.sof3.kingdom.hclib.generator

import org.w3c.dom.Node

data class SimpleType(
		val type: String,
		val default: (String) -> String = { "\"$it\"" },
		val imports: Set<String> = emptySet(),
		val inputType: String = type,
		val mangleInput: (String) -> String = { it },
		val fn: IndentedWriter.() -> Unit
)

class SimpleTypes {
	val types = mutableMapOf<String, SimpleType>()

	fun add(node: Node, prefix: String, vararg nameNodes: Node): String {
		val name = nameFor(prefix, *nameNodes)
		assert(name !in types)
		types[name] = typeOf(node, name)
		return name
	}

	fun xs(name: String): SimpleType {
		val typeName = xsName(name)
		types[typeName].ifNotNull { return it }
		val type = when (name) {
			"nonNegativeInteger" -> SimpleType(typeName, default = { it }) { writeln("typealias $typeName = Int") }
			"dateTime" -> SimpleType(typeName, imports = setOf("java.util.Date")) { writeln("typealias $typeName = Date") }
			"NMTOKENS", "IDREFS" -> SimpleType(typeName,
					default = { defaultValue ->
						val values = defaultValue.split(" ").filter(String::isNotEmpty)
						values.joinToString(prefix = "listOf${if (values.isEmpty()) "<String>" else ""}(", postfix = ")") { "\"$it\"" }
						values.joinToString(prefix = "listOf${if (values.isEmpty()) "<String>" else ""}(", postfix = ")") { "\"$it\"" }
					},
					inputType = "List<String>",
					mangleInput = { "$typeName($it)" },
					fn = listClassWriter(typeName, " "))
			else -> SimpleType(typeName) { writeln("typealias $typeName = String") }
		}
		types[typeName] = type
		return type
	}
}

fun xsName(name: String) = "Xs${name.formatToPascal()}"

fun nameFor(prefix: String, vararg nameNodes: Node) = prefix +
		nameNodes.joinToString("") { it["name"]?.formatToPascal() ?: "" }

private fun typeOf(type: Node, typeName: String): SimpleType {
	val anno = getAnnotation(type)

	type.firstChild("restriction") { restr ->
		restr.firstChild("length") { len ->
			if (len["value"] == "1" && len["fixed"] == "true") {
				return SimpleType(typeName, default = { "'$it'" }) { writeln("typealias $typeName = Char") }
			}
		}
		if (restr["base"]?.startsWith("xs:") == true) {
			val xs = ParsedModel.simpleTypes.xs(restr["base"]!!.substring(3))
			return SimpleType(typeName, default = xs.default, imports = xs.imports) {
				writeln("typealias $typeName = ${xsName(restr["base"]!!.substring(3))}")
			}
		}
		if (restr["base"] == "Number") return SimpleType(typeName, default = { it }) { writeln("typealias $typeName = Int") }
		if (restr.firstChild("enumeration") != null) {
			return SimpleType(typeName, default = { "$typeName.${cleanKeyword(it)}" }) {
				writeln("enum class $typeName {")
				indented {
					restr.children("enumeration") { enum ->
						writeln(cleanKeyword(enum["value"]!!) + ",")
					}
				}
				writeln("}")
			}
		}
	}

	for ((keyword, actual) in mapOf("comma" to ",", "space" to " ")) {
		if (anno != null && (anno.contains("$keyword separated") || anno.contains("$keyword-separated"))) {
			return SimpleType(typeName, default = { defaultValue ->
				val values = defaultValue.split(actual).filter(String::isNotEmpty)
				values.joinToString(prefix = "listOf${if (values.isEmpty()) "<String>" else ""}(", postfix = ")") { "\"$it\"" }
			}, fn = listClassWriter(typeName, actual))
		}
	}

	// TODO special: Script
	// TODO special: StyleSheet
	// TODO special: Length
	// TODO special: MultiLength
	// TODO special: Coords

	return SimpleType(typeName) { writeln("typealias $typeName = String") }
}

fun listClassWriter(typeName: String, separator: String): IndentedWriter.() -> Unit = {
	writeln("class $typeName(val list: List<String>) {")
	indented {
		writeln("override fun toString() = list.joinToString(\"$separator\")")
	}
	writeln("}")
}
