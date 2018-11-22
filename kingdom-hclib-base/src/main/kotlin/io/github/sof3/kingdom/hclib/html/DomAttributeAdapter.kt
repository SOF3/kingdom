package io.github.sof3.kingdom.hclib.html

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

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

class DomAttributeAdapter<T>(val name: String, val dom: DomElementImpl, val default: T?) : ReadWriteProperty<Any, T?> {
	var set = false
	var value: T? = default

	override fun getValue(thisRef: Any, property: KProperty<*>) = value

	override fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
		if (value == this.value) return
		this.value = value
		if (value == default || value == null) {
			set = false
			dom.attributes.remove(name)
		} else {
			set = true
			dom.attributes[name] = value.toString()
		}
	}
}
