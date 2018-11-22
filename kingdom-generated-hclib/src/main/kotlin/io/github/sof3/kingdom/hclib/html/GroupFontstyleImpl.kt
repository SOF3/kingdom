@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupFontstyleImpl(private val dom: DomElementImpl) : GroupFontstyle, DomGroup by DomGroupImpl(dom){
	override val tt get() = ElementTt(DomElementImpl(dom))
	override val i get() = ElementI(DomElementImpl(dom))
	override val b get() = ElementB(DomElementImpl(dom))
	override val big get() = ElementBig(DomElementImpl(dom))
	override val small get() = ElementSmall(DomElementImpl(dom))
}
