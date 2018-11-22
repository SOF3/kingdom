@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

interface ComplexPreContent : GroupFontstyle, GroupPhrase, GroupSpecialPre, GroupMiscInline, GroupInlineForms {

	val a: ElementA

	operator fun String.unaryPlus(): ComplexPreContent {
		plusAssign(this)
		return this@ComplexPreContent
	}

	operator fun plusAssign(string: String)
}
