@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

interface ComplexAContent : GroupSpecial, GroupFontstyle, GroupPhrase, GroupInlineForms, GroupMiscInline {


	operator fun String.unaryPlus(): ComplexAContent {
		plusAssign(this)
		return this@ComplexAContent
	}

	operator fun plusAssign(string: String)
}
