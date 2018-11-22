@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

class ElementImg(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "img"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, src: SimpleURI? = null, alt: SimpleText? = null, longdesc: SimpleURI? = null, height: SimpleLength? = null, width: SimpleLength? = null, usemap: SimpleURI? = null, ismap: AttrTypeImgIsmap? = null, fn: ElementImg.() -> Unit = {}): ElementImg {
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
		if (src != null) this.src = src
		if (alt != null) this.alt = alt
		if (longdesc != null) this.longdesc = longdesc
		if (height != null) this.height = height
		if (width != null) this.width = width
		if (usemap != null) this.usemap = usemap
		if (ismap != null) this.ismap = ismap
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementImg.() -> Unit) = apply(fn)

	var src: SimpleURI? by DomAttributeAdapter("src", dom, null as SimpleURI?)
	var alt: SimpleText? by DomAttributeAdapter("alt", dom, null as SimpleText?)
	var longdesc: SimpleURI? by DomAttributeAdapter("longdesc", dom, null as SimpleURI?)
	var height: SimpleLength? by DomAttributeAdapter("height", dom, null as SimpleLength?)
	var width: SimpleLength? by DomAttributeAdapter("width", dom, null as SimpleLength?)
	var usemap: SimpleURI? by DomAttributeAdapter("usemap", dom, null as SimpleURI?)
	var ismap: AttrTypeImgIsmap? by DomAttributeAdapter("ismap", dom, null as AttrTypeImgIsmap?)


}
