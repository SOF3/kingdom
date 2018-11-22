@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * The title element is not considered part of the flow of text.
 * It should be displayed, for example as the page header or
 * window title. Exactly one title is required per document.
 */
class ElementTitle(internal val dom: DomElementImpl) : AttrGroupI18n by AttrGroupI18nImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "title"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, id: XsID? = null, fn: ElementTitle.() -> Unit = {}): ElementTitle {
		if (lang != null) this.lang = lang
		if (dir != null) this.dir = dir
		if (id != null) this.id = id
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementTitle.() -> Unit) = apply(fn)

	var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)


	operator fun String.unaryPlus(): ElementTitle {
		plusAssign(this)
		return this@ElementTitle
	}

	operator fun plusAssign(string: String){
		dom.addPlain(string)
	}

	@Suppress("UNUSED_PARAMETER") operator fun plus(dom: DomElement) = this
}
