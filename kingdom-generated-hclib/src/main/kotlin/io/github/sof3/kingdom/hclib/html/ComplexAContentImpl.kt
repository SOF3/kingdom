@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class ComplexAContentImpl(private val dom: DomElementImpl) : GroupSpecial by GroupSpecialImpl(dom), GroupFontstyle by GroupFontstyleImpl(dom), GroupPhrase by GroupPhraseImpl(dom), GroupInlineForms by GroupInlineFormsImpl(dom), GroupMiscInline by GroupMiscInlineImpl(dom), ComplexAContent {


	override fun String.unaryPlus(): ComplexAContentImpl {
		plusAssign(this)
		return this@ComplexAContentImpl
	}

	override fun plusAssign(string: String){
		dom.addPlain(string)
	}

	override fun plus(dom: DomElement) = this
}
