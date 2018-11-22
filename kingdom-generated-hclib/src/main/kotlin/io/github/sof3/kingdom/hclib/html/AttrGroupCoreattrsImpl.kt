@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class AttrGroupCoreattrsImpl(private val dom: DomElementImpl) : AttrGroupCoreattrs, DomAttributeGroup by DomAttributeGroupImpl(dom) {
	override var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)
	override var classes: XsNMTOKENS? by DomAttributeAdapter("class", dom, null as XsNMTOKENS?)
	override var style: SimpleStyleSheet? by DomAttributeAdapter("style", dom, null as SimpleStyleSheet?)
	override var title: SimpleText? by DomAttributeAdapter("title", dom, null as SimpleText?)
}
