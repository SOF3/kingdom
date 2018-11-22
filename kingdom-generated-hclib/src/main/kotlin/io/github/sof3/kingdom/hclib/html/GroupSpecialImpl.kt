@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupSpecialImpl(private val dom: DomElementImpl) : GroupSpecial, DomGroup by DomGroupImpl(dom), GroupSpecialPre by GroupSpecialPreImpl(dom){
	override val obj get() = ElementObject(DomElementImpl(dom))
	override val img get() = ElementImg(DomElementImpl(dom))
}
