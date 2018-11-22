@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class ComplexInlineImpl(private val dom: DomElementImpl) : GroupInline by GroupInlineImpl(dom), GroupMiscInline by GroupMiscInlineImpl(dom), ComplexInline {


	override fun plusAssign(string: String){
		dom.addPlain(string)
	}
}
