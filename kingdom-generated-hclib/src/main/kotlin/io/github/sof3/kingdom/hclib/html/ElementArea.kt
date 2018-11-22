@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

class ElementArea(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), AttrGroupFocus by AttrGroupFocusImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "area"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, accesskey: SimpleCharacter? = null, tabindex: SimpleTabindexNumber? = null, onfocus: SimpleScript? = null, onblur: SimpleScript? = null, shape: SimpleShape? = null, coords: SimpleCoords? = null, href: SimpleURI? = null, nohref: AttrTypeAreaNohref? = null, alt: SimpleText? = null, fn: ElementArea.() -> Unit = {}): ElementArea {
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
		if (shape != null) this.shape = shape
		if (coords != null) this.coords = coords
		if (href != null) this.href = href
		if (nohref != null) this.nohref = nohref
		if (alt != null) this.alt = alt
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementArea.() -> Unit) = apply(fn)

	var shape: SimpleShape? by DomAttributeAdapter("shape", dom, "rect")
	var coords: SimpleCoords? by DomAttributeAdapter("coords", dom, null as SimpleCoords?)
	var href: SimpleURI? by DomAttributeAdapter("href", dom, null as SimpleURI?)
	var nohref: AttrTypeAreaNohref? by DomAttributeAdapter("nohref", dom, null as AttrTypeAreaNohref?)
	var alt: SimpleText? by DomAttributeAdapter("alt", dom, null as SimpleText?)


}
