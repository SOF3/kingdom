package io.github.sof3.kingdom.hclib.generator

import org.w3c.dom.Node
import java.io.Writer

class IndentedWriter(private val writer: Writer) : Writer() {
	var newline = true
	var indents = 0

	override fun write(cbuf: CharArray?, off: Int, len: Int) {
		if (newline) {
			repeat(indents) {
				writer.write(Config.indent)
			}
			newline = false
		}
		writer.write(cbuf, off, len)
		newline = false
	}

	fun writeln() {
		writer.write(Config.lineSeparator)
		newline = true
	}

	fun writeln(string: String) {
		write(string)
		writeln()
	}

	override fun flush() = writer.flush()

	override fun close() = writer.close()

	inline fun indented(fn: () -> Unit) {
		indents++
		try {
			fn()
		} finally {
			indents--
		}
	}
}

fun IndentedWriter.writeStandardHeader() {
	writeln("""@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")""")
	writeln()
	writeln("package io.github.sof3.kingdom.hclib.html")
	writeln()
	writeln("import javax.annotation.Generated")
}

fun getAnnotation(node: Node): List<String>? {
	val output = mutableListOf<String>()
	node.firstChild("annotation") { annotation ->
		annotation.firstChild("documentation") { documentation ->
			val doc = documentation.textContent
			for (line in doc
					.replace(Regex("<[^>]+>"), "")
					.replace(Regex("^[ \t]+", RegexOption.MULTILINE), "")
					.split("\n")
					.filter { it.isNotEmpty() }) {
				output += line
			}
			return output
		}
	}
	return null
}

fun IndentedWriter.writeAnnotation(node: Node): String? {
	val anno = getAnnotation(node)
	if (anno != null) {
		writeln("/**")
		for (line in anno) writeln(" * $line")
		writeln(" */")
		return anno.joinToString(" ")
	}
	return null
}

fun Writer.indentedWriter(fn: IndentedWriter.() -> Unit) = use {
	IndentedWriter(this).fn()
}
