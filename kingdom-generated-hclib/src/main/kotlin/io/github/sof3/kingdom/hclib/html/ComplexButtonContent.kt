@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

interface ComplexButtonContent : GroupHeading, GroupLists, GroupBlocktext, GroupSpecial, GroupFontstyle, GroupPhrase, GroupMisc {

	val p: ElementP
	val div: ElementDiv
	val table: ElementTable

	operator fun String.unaryPlus(): ComplexButtonContent

	operator fun plusAssign(string: String)

	operator fun plus(dom: DomElement) = this
}
