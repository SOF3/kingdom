@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class AttrGroupEventsImpl(private val dom: DomElementImpl) : AttrGroupEvents, DomAttributeGroup by DomAttributeGroupImpl(dom) {
	override var onclick: SimpleScript? by DomAttributeAdapter("onclick", dom, null as SimpleScript?)
	override var ondblclick: SimpleScript? by DomAttributeAdapter("ondblclick", dom, null as SimpleScript?)
	override var onmousedown: SimpleScript? by DomAttributeAdapter("onmousedown", dom, null as SimpleScript?)
	override var onmouseup: SimpleScript? by DomAttributeAdapter("onmouseup", dom, null as SimpleScript?)
	override var onmouseover: SimpleScript? by DomAttributeAdapter("onmouseover", dom, null as SimpleScript?)
	override var onmousemove: SimpleScript? by DomAttributeAdapter("onmousemove", dom, null as SimpleScript?)
	override var onmouseout: SimpleScript? by DomAttributeAdapter("onmouseout", dom, null as SimpleScript?)
	override var onkeypress: SimpleScript? by DomAttributeAdapter("onkeypress", dom, null as SimpleScript?)
	override var onkeydown: SimpleScript? by DomAttributeAdapter("onkeydown", dom, null as SimpleScript?)
	override var onkeyup: SimpleScript? by DomAttributeAdapter("onkeyup", dom, null as SimpleScript?)
}
