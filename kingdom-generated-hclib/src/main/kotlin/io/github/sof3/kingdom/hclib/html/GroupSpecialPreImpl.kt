@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupSpecialPreImpl(private val dom: DomElementImpl) : GroupSpecialPre, DomGroup by DomGroupImpl(dom){
	override val br get() = ElementBr(DomElementImpl(dom))
	override val span get() = ElementSpan(DomElementImpl(dom))
	override val bdo get() = ElementBdo(DomElementImpl(dom))
	override val map get() = ElementMap(DomElementImpl(dom))
}
