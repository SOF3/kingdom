@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupInlineImpl(private val dom: DomElementImpl) : GroupInline, DomGroup by DomGroupImpl(dom), GroupSpecial by GroupSpecialImpl(dom), GroupFontstyle by GroupFontstyleImpl(dom), GroupPhrase by GroupPhraseImpl(dom), GroupInlineForms by GroupInlineFormsImpl(dom){
	override val a get() = ElementA(DomElementImpl(dom))
}
