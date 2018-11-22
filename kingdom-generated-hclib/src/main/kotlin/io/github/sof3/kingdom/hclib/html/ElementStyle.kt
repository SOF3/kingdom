@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * style info, which may include CDATA sections
 */
class ElementStyle(internal val dom: DomElementImpl) : AttrGroupI18n by AttrGroupI18nImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "style"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, id: XsID? = null, type: SimpleContentType? = null, media: SimpleMediaDesc? = null, title: SimpleText? = null, fn: ElementStyle.() -> Unit = {}): ElementStyle {
		if (lang != null) this.lang = lang
		if (dir != null) this.dir = dir
		if (id != null) this.id = id
		if (type != null) this.type = type
		if (media != null) this.media = media
		if (title != null) this.title = title
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementStyle.() -> Unit) = apply(fn)

	var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)
	var type: SimpleContentType? by DomAttributeAdapter("type", dom, null as SimpleContentType?)
	var media: SimpleMediaDesc? by DomAttributeAdapter("media", dom, null as SimpleMediaDesc?)
	var title: SimpleText? by DomAttributeAdapter("title", dom, null as SimpleText?)


	operator fun String.unaryPlus(): ElementStyle {
		plusAssign(this)
		return this@ElementStyle
	}

	operator fun plusAssign(string: String){
		dom.addPlain(string)
	}

	operator fun plus(dom: DomElement) = this
}
