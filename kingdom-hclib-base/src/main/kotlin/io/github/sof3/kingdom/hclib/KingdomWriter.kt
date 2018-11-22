package io.github.sof3.kingdom.hclib

import java.io.Writer

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

class KingdomWriter(val delegate: Writer, val config: KingdomWriterConfig) : Writer() {
	private var lineSize = 0
	var indents = 0
	var cont = false

	inline fun indented(fn: () -> Unit) {
		indents++
		try {
			fn()
		} finally {
			indents--
		}
	}

	/**
	 * Writes a line of tokens. A null token means a whitespace character that can be omitted if it is at hard wraps.
	 */
	fun writeLine(vararg tokens: String?, doNewLine: Boolean = true) {
		for (i in 0 until tokens.size) {
			if (tokens[i] != null) write(tokens[i])
			else if (tokens[i + 1] != null) {
				val next = tokens[i + 1]!!
				if (lineSize + next.length + 1 <= config.hardWrap) { // we will not need to hard wrap
					write(" ")
				}
			}
		}
		if (doNewLine) newLine()
	}

	override fun write(cbuf: CharArray?, off: Int, len: Int) {
		if (len == 0) return
		if (lineSize + len > config.hardWrap) {
			cont = true
			delegate.write(config.newline)
			lineSize = 0
		}
		if (lineSize == 0) {
			if (indents > 0) {
				delegate.write(config.indent.repeat(indents))
				lineSize += config.indentSize * indents
			}
			if (cont) {
				delegate.write(config.contIndent)
				lineSize += config.contIndentSize
			}
		}
		delegate.write(cbuf, off, len)
		lineSize += len
	}

	fun newLine() {
		cont = false
		delegate.write(config.newline)
		lineSize = 0
	}

	override fun flush() = delegate.flush()

	override fun close() = delegate.close()
}
