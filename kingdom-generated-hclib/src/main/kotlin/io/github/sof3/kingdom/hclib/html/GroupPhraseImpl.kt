@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class GroupPhraseImpl(private val dom: DomElementImpl) : GroupPhrase, DomGroup by DomGroupImpl(dom){
	override val em get() = ElementEm(DomElementImpl(dom))
	override val strong get() = ElementStrong(DomElementImpl(dom))
	override val dfn get() = ElementDfn(DomElementImpl(dom))
	override val code get() = ElementCode(DomElementImpl(dom))
	override val q get() = ElementQ(DomElementImpl(dom))
	override val samp get() = ElementSamp(DomElementImpl(dom))
	override val kbd get() = ElementKbd(DomElementImpl(dom))
	override val variable get() = ElementVar(DomElementImpl(dom))
	override val citeElement get() = ElementCite(DomElementImpl(dom))
	override val abbrElement get() = ElementAbbr(DomElementImpl(dom))
	override val acronym get() = ElementAcronym(DomElementImpl(dom))
	override val sub get() = ElementSub(DomElementImpl(dom))
	override val sup get() = ElementSup(DomElementImpl(dom))
}
