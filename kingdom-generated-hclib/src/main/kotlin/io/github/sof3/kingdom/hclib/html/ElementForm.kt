@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

class ElementForm(internal val dom: DomElementImpl) : ComplexFormContent by ComplexFormContentImpl(dom), AttrGroupAttrs by AttrGroupAttrsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "form"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, action: SimpleURI? = null, method: AttrTypeMethod? = null, enctype: SimpleContentType? = null, onsubmit: SimpleScript? = null, onreset: SimpleScript? = null, accept: SimpleContentTypes? = null, acceptCharset: SimpleCharsets? = null, fn: ElementForm.() -> Unit = {}): ElementForm {
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
		if (action != null) this.action = action
		if (method != null) this.method = method
		if (enctype != null) this.enctype = enctype
		if (onsubmit != null) this.onsubmit = onsubmit
		if (onreset != null) this.onreset = onreset
		if (accept != null) this.accept = accept
		if (acceptCharset != null) this.acceptCharset = acceptCharset
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementForm.() -> Unit) = apply(fn)

	var action: SimpleURI? by DomAttributeAdapter("action", dom, null as SimpleURI?)
	var method: AttrTypeMethod? by DomAttributeAdapter("method", dom, "get")
	var enctype: SimpleContentType? by DomAttributeAdapter("enctype", dom, "application/x-www-form-urlencoded")
	var onsubmit: SimpleScript? by DomAttributeAdapter("onsubmit", dom, null as SimpleScript?)
	var onreset: SimpleScript? by DomAttributeAdapter("onreset", dom, null as SimpleScript?)
	var accept: SimpleContentTypes? by DomAttributeAdapter("accept", dom, null as SimpleContentTypes?)
	var acceptCharset: SimpleCharsets? by DomAttributeAdapter("accept-charset", dom, null as SimpleCharsets?)


}
