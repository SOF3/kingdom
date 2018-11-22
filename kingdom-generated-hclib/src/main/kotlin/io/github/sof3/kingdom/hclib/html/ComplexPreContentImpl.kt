@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class ComplexPreContentImpl(private val dom: DomElementImpl) : GroupFontstyle by GroupFontstyleImpl(dom), GroupPhrase by GroupPhraseImpl(dom), GroupSpecialPre by GroupSpecialPreImpl(dom), GroupMiscInline by GroupMiscInlineImpl(dom), GroupInlineForms by GroupInlineFormsImpl(dom), ComplexPreContent {

	override val a get() = ElementA(DomElementImpl(dom))

	override fun String.unaryPlus(): ComplexPreContentImpl {
		plusAssign(this)
		return this@ComplexPreContentImpl
	}

	override fun plusAssign(string: String){
		dom.addPlain(string)
	}

	override fun plus(dom: DomElement) = this
}
