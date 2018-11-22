@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class ComplexFlowImpl(private val dom: DomElementImpl) : GroupBlock by GroupBlockImpl(dom), GroupInline by GroupInlineImpl(dom), GroupMisc by GroupMiscImpl(dom), ComplexFlow {

	override val form get() = ElementForm(DomElementImpl(dom))

	override fun plusAssign(string: String){
		dom.addPlain(string)
	}
}
