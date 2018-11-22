package io.github.sof3.kingdom.hclib.html

import org.junit.Test

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

class BasicTest {
	@Test
	fun basicTest() = testImpl("basicTest") {
		head {
			title += "Hello World"
		}
		body {
			div("div1") {
				+"This is a regular message. "
				+"This is appended to the message." + br
				+"This is another line. "
				+"<>\"&'</> are escaped. "
				+"These     are 5 spaces."
			}
			div("div2", classes = listOf("class1", "class2")) += "This is another div."
			div("div3") {
				+"This is a parent div."
				div("div4") += "This is a nested div."
				input(type = SimpleInputType.button, value = "These are two") + input(type = SimpleInputType.button, value = "nested buttons.")
			}
		}
	}

}
