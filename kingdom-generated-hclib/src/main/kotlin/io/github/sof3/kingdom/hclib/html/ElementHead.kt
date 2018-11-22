@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * content model is "head.misc" combined with a single
 * title and an optional base element in any order
 */
class ElementHead(internal val dom: DomElementImpl) : AttrGroupI18n by AttrGroupI18nImpl(dom), GroupHeadMisc by GroupHeadMiscImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "head"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, id: XsID? = null, profile: SimpleURI? = null, fn: ElementHead.() -> Unit = {}): ElementHead {
		if (lang != null) this.lang = lang
		if (dir != null) this.dir = dir
		if (id != null) this.id = id
		if (profile != null) this.profile = profile
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementHead.() -> Unit) = apply(fn)

	var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)
	var profile: SimpleURI? by DomAttributeAdapter("profile", dom, null as SimpleURI?)

	val title get() = ElementTitle(DomElementImpl(dom))
	val base get() = ElementBase(DomElementImpl(dom))

	operator fun plus(dom: DomElement) = this
}
