@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class ComplexBlockImpl(private val dom: DomElementImpl) : GroupBlock by GroupBlockImpl(dom), GroupMisc by GroupMiscImpl(dom), ComplexBlock {

	override val form get() = ElementForm(DomElementImpl(dom))

	override fun plus(dom: DomElement) = this
}
