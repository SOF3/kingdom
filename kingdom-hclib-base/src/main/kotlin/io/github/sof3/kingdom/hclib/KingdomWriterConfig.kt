package io.github.sof3.kingdom.hclib

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

data class KingdomWriterConfig(
		val indent: String = "\t",
		val newline: String = System.lineSeparator(),
		val contIndent: String = "\t\t",
		val tabSize: Int = 4,
		val hardWrap: Int = 120
) {
	val indentSize by lazy { tabAdjustedSize(indent, tabSize) }
	val contIndentSize by lazy { tabAdjustedSize(contIndent, tabSize) }
}

private fun tabAdjustedSize(string: String, tabSize: Int): Int {
	val tabs = string.count { it == '\t' }
	return tabs * tabSize + string.length - tabs
}
