package io.github.sof3.kingdom.hclib.html

import io.github.sof3.kingdom.hclib.KingdomWriter
import io.github.sof3.kingdom.hclib.KingdomWriterConfig
import org.apache.commons.io.IOUtils
import java.io.InputStreamReader
import java.io.StringWriter
import kotlin.test.assertEquals

fun testImpl(testName: String, fn: ElementHtml.() -> Unit) {
	val writer = StringWriter()
	html(fn)(KingdomWriter(writer, KingdomWriterConfig()))

	val actual = writer.buffer.toString()

	val expect = IOUtils.toString(InputStreamReader(object {}.javaClass.classLoader.getResourceAsStream("$testName.html")))

	val clearIndents = { str: String -> str.replace(Regex("(\r\n|\n)[ \t]*"), "") }

	assertEquals(clearIndents(expect), clearIndents(actual), "HTML not identical")
}
