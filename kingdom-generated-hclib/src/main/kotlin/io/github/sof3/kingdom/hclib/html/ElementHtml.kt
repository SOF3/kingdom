@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

class ElementHtml(internal val dom: DomElementImpl) : AttrGroupI18n by AttrGroupI18nImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "html"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, id: XsID? = null, fn: ElementHtml.() -> Unit = {}): ElementHtml {
		if (lang != null) this.lang = lang
		if (dir != null) this.dir = dir
		if (id != null) this.id = id
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementHtml.() -> Unit) = apply(fn)

	var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)

	val head get() = ElementHead(DomElementImpl(dom))
	val body get() = ElementBody(DomElementImpl(dom))

	operator fun plus(dom: DomElement) = this
}
