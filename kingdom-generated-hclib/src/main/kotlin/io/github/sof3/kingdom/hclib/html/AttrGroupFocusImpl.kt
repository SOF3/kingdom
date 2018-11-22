@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class AttrGroupFocusImpl(private val dom: DomElementImpl) : AttrGroupFocus, DomAttributeGroup by DomAttributeGroupImpl(dom) {
	override var accesskey: SimpleCharacter? by DomAttributeAdapter("accesskey", dom, null as SimpleCharacter?)
	override var tabindex: SimpleTabindexNumber? by DomAttributeAdapter("tabindex", dom, null as SimpleTabindexNumber?)
	override var onfocus: SimpleScript? by DomAttributeAdapter("onfocus", dom, null as SimpleScript?)
	override var onblur: SimpleScript? by DomAttributeAdapter("onblur", dom, null as SimpleScript?)
}
