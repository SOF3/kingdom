@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

interface ComplexFlow : GroupBlock, GroupInline, GroupMisc {

	val form: ElementForm

	operator fun String.unaryPlus(): ComplexFlow

	operator fun plusAssign(string: String)

	operator fun plus(dom: DomElement) = this
}
