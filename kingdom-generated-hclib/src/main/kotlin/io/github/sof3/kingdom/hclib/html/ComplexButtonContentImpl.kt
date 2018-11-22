@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class ComplexButtonContentImpl(private val dom: DomElementImpl) : GroupHeading by GroupHeadingImpl(dom), GroupLists by GroupListsImpl(dom), GroupBlocktext by GroupBlocktextImpl(dom), GroupSpecial by GroupSpecialImpl(dom), GroupFontstyle by GroupFontstyleImpl(dom), GroupPhrase by GroupPhraseImpl(dom), GroupMisc by GroupMiscImpl(dom), ComplexButtonContent {

	override val p get() = ElementP(DomElementImpl(dom))
	override val div get() = ElementDiv(DomElementImpl(dom))
	override val table get() = ElementTable(DomElementImpl(dom))

	override fun plusAssign(string: String){
		dom.addPlain(string)
	}
}
