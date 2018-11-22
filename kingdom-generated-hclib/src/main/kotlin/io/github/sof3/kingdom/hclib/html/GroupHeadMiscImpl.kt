@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupHeadMiscImpl(private val dom: DomElementImpl) : GroupHeadMisc, DomGroup by DomGroupImpl(dom){
	override val script get() = ElementScript(DomElementImpl(dom))
	override val style get() = ElementStyle(DomElementImpl(dom))
	override val meta get() = ElementMeta(DomElementImpl(dom))
	override val link get() = ElementLink(DomElementImpl(dom))
	override val obj get() = ElementObject(DomElementImpl(dom))
}
