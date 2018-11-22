@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupListsImpl(private val dom: DomElementImpl) : GroupLists, DomGroup by DomGroupImpl(dom){
	override val ul get() = ElementUl(DomElementImpl(dom))
	override val ol get() = ElementOl(DomElementImpl(dom))
	override val dl get() = ElementDl(DomElementImpl(dom))
}
