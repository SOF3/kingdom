@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupMiscImpl(private val dom: DomElementImpl) : GroupMisc, DomGroup by DomGroupImpl(dom), GroupMiscInline by GroupMiscInlineImpl(dom){
	override val noscript get() = ElementNoscript(DomElementImpl(dom))
}
