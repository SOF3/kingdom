@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupHeadingImpl(private val dom: DomElementImpl) : GroupHeading, DomGroup by DomGroupImpl(dom){
	override val h1 get() = ElementH1(DomElementImpl(dom))
	override val h2 get() = ElementH2(DomElementImpl(dom))
	override val h3 get() = ElementH3(DomElementImpl(dom))
	override val h4 get() = ElementH4(DomElementImpl(dom))
	override val h5 get() = ElementH5(DomElementImpl(dom))
	override val h6 get() = ElementH6(DomElementImpl(dom))
}
