@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class AttrGroupCellhalignImpl(private val dom: DomElementImpl) : AttrGroupCellhalign, DomAttributeGroup by DomAttributeGroupImpl(dom) {
	override var align: AttrTypeCellhalignAlign? by DomAttributeAdapter("align", dom, null as AttrTypeCellhalignAlign?)
	override var char: SimpleCharacter? by DomAttributeAdapter("char", dom, null as SimpleCharacter?)
	override var charoff: SimpleLength? by DomAttributeAdapter("charoff", dom, null as SimpleLength?)
}
