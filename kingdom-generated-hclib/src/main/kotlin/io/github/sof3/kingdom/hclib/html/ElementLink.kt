@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * Relationship values can be used in principle:
 * a) for document specific toolbars/menus when used
 * with the link element in document head e.g.
 * start, contents, previous, next, index, end, help
 * b) to link to a separate style sheet (rel="stylesheet")
 * c) to make a link to a script (rel="script")
 * d) by stylesheets to control how collections of
 * html nodes are rendered into printed documents
 * e) to make a link to a printable version of this document
 * e.g. a PostScript or PDF version (rel="alternate" media="print")
 */
class ElementLink(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "link"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, charset: SimpleCharset? = null, href: SimpleURI? = null, hreflang: SimpleLanguageCode? = null, type: SimpleContentType? = null, rel: SimpleLinkTypes? = null, rev: SimpleLinkTypes? = null, media: SimpleMediaDesc? = null, fn: ElementLink.() -> Unit = {}): ElementLink {
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
		if (charset != null) this.charset = charset
		if (href != null) this.href = href
		if (hreflang != null) this.hreflang = hreflang
		if (type != null) this.type = type
		if (rel != null) this.rel = rel
		if (rev != null) this.rev = rev
		if (media != null) this.media = media
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementLink.() -> Unit) = apply(fn)

	var charset: SimpleCharset? by DomAttributeAdapter("charset", dom, null as SimpleCharset?)
	var href: SimpleURI? by DomAttributeAdapter("href", dom, null as SimpleURI?)
	var hreflang: SimpleLanguageCode? by DomAttributeAdapter("hreflang", dom, null as SimpleLanguageCode?)
	var type: SimpleContentType? by DomAttributeAdapter("type", dom, null as SimpleContentType?)
	var rel: SimpleLinkTypes? by DomAttributeAdapter("rel", dom, null as SimpleLinkTypes?)
	var rev: SimpleLinkTypes? by DomAttributeAdapter("rev", dom, null as SimpleLinkTypes?)
	var media: SimpleMediaDesc? by DomAttributeAdapter("media", dom, null as SimpleMediaDesc?)


	operator fun plus(dom: DomElement) = this
}
