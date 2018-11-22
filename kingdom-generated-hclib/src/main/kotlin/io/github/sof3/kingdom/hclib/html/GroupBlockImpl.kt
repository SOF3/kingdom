@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupBlockImpl(private val dom: DomElementImpl) : GroupBlock, DomGroup by DomGroupImpl(dom), GroupHeading by GroupHeadingImpl(dom), GroupLists by GroupListsImpl(dom), GroupBlocktext by GroupBlocktextImpl(dom){
	override val p get() = ElementP(DomElementImpl(dom))
	override val div get() = ElementDiv(DomElementImpl(dom))
	override val fieldset get() = ElementFieldset(DomElementImpl(dom))
	override val table get() = ElementTable(DomElementImpl(dom))
}
