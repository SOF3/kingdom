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
				+"This is a regular message"
				+"This is appended to the message"
				+"<>\"&'</> are escaped"
			}
			div(classes = listOf("class1", "class2")) += "This is another div"
		}
	}

}
