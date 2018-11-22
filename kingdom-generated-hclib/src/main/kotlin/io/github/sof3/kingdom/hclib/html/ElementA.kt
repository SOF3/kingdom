@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * content is "Inline" except that anchors shouldn't be nested
 */
class ElementA(internal val dom: DomElementImpl) : ComplexAContent by ComplexAContentImpl(dom), AttrGroupAttrs by AttrGroupAttrsImpl(dom), AttrGroupFocus by AttrGroupFocusImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "a"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, accesskey: SimpleCharacter? = null, tabindex: SimpleTabindexNumber? = null, onfocus: SimpleScript? = null, onblur: SimpleScript? = null, charset: SimpleCharset? = null, type: SimpleContentType? = null, name: XsNMTOKEN? = null, href: SimpleURI? = null, hreflang: SimpleLanguageCode? = null, rel: SimpleLinkTypes? = null, rev: SimpleLinkTypes? = null, shape: SimpleShape? = null, coords: SimpleCoords? = null, fn: ElementA.() -> Unit = {}): ElementA {
		if (id != null) this.id = id
		if (classes != null) this.classes = XsNMTOKENS(classes)
		if (style != null) this.style = style
		if (title != null) this.title = title
		if (lang != null) this.lang = lang
		if (dir != null) this.dir = dir
		if (onclick != null) this.onclick = onclick
		if (ondblclick != null) this.ondblclick = ondblclick
		if (onmousedown != null) this.onmousedown = onmousedown
		if (onmouseup != null) this.onmouseup = onmouseup
		if (onmouseover != null) this.onmouseover = onmouseover
		if (onmousemove != null) this.onmousemove = onmousemove
		if (onmouseout != null) this.onmouseout = onmouseout
		if (onkeypress != null) this.onkeypress = onkeypress
		if (onkeydown != null) this.onkeydown = onkeydown
		if (onkeyup != null) this.onkeyup = onkeyup
		if (accesskey != null) this.accesskey = accesskey
		if (tabindex != null) this.tabindex = tabindex
		if (onfocus != null) this.onfocus = onfocus
		if (onblur != null) this.onblur = onblur
		if (charset != null) this.charset = charset
		if (type != null) this.type = type
		if (name != null) this.name = name
		if (href != null) this.href = href
		if (hreflang != null) this.hreflang = hreflang
		if (rel != null) this.rel = rel
		if (rev != null) this.rev = rev
		if (shape != null) this.shape = shape
		if (coords != null) this.coords = coords
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementA.() -> Unit) = apply(fn)

	var charset: SimpleCharset? by DomAttributeAdapter("charset", dom, null as SimpleCharset?)
	var type: SimpleContentType? by DomAttributeAdapter("type", dom, null as SimpleContentType?)
	var name: XsNMTOKEN? by DomAttributeAdapter("name", dom, null as XsNMTOKEN?)
	var href: SimpleURI? by DomAttributeAdapter("href", dom, null as SimpleURI?)
	var hreflang: SimpleLanguageCode? by DomAttributeAdapter("hreflang", dom, null as SimpleLanguageCode?)
	var rel: SimpleLinkTypes? by DomAttributeAdapter("rel", dom, null as SimpleLinkTypes?)
	var rev: SimpleLinkTypes? by DomAttributeAdapter("rev", dom, null as SimpleLinkTypes?)
	var shape: SimpleShape? by DomAttributeAdapter("shape", dom, SimpleShape.rect)
	var coords: SimpleCoords? by DomAttributeAdapter("coords", dom, null as SimpleCoords?)


	override fun plus(dom: DomElement) = this
}
