@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupMiscInlineImpl(private val dom: DomElementImpl) : GroupMiscInline, DomGroup by DomGroupImpl(dom){
	override val ins get() = ElementIns(DomElementImpl(dom))
	override val del get() = ElementDel(DomElementImpl(dom))
	override val script get() = ElementScript(DomElementImpl(dom))
}
