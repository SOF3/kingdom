@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupBlocktextImpl(private val dom: DomElementImpl) : GroupBlocktext, DomGroup by DomGroupImpl(dom){
	override val pre get() = ElementPre(DomElementImpl(dom))
	override val hr get() = ElementHr(DomElementImpl(dom))
	override val blockquote get() = ElementBlockquote(DomElementImpl(dom))
	override val address get() = ElementAddress(DomElementImpl(dom))
}
