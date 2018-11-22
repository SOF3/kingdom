@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupInlineFormsImpl(private val dom: DomElementImpl) : GroupInlineForms, DomGroup by DomGroupImpl(dom){
	override val input get() = ElementInput(DomElementImpl(dom))
	override val select get() = ElementSelect(DomElementImpl(dom))
	override val textarea get() = ElementTextarea(DomElementImpl(dom))
	override val label get() = ElementLabel(DomElementImpl(dom))
	override val button get() = ElementButton(DomElementImpl(dom))
}
