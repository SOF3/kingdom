@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * form control
 */
class ElementInput(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), AttrGroupFocus by AttrGroupFocusImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "input"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, accesskey: SimpleCharacter? = null, tabindex: SimpleTabindexNumber? = null, onfocus: SimpleScript? = null, onblur: SimpleScript? = null, type: SimpleInputType? = null, name: String? = null, value: String? = null, checked: AttrTypeInputChecked? = null, disabled: AttrTypeInputDisabled? = null, readonly: AttrTypeInputReadonly? = null, size: String? = null, maxlength: SimpleNumber? = null, src: SimpleURI? = null, alt: String? = null, usemap: SimpleURI? = null, onselect: SimpleScript? = null, onchange: SimpleScript? = null, accept: SimpleContentTypes? = null, fn: ElementInput.() -> Unit = {}): ElementInput {
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
		if (type != null) this.type = type
		if (name != null) this.name = name
		if (value != null) this.value = value
		if (checked != null) this.checked = checked
		if (disabled != null) this.disabled = disabled
		if (readonly != null) this.readonly = readonly
		if (size != null) this.size = size
		if (maxlength != null) this.maxlength = maxlength
		if (src != null) this.src = src
		if (alt != null) this.alt = alt
		if (usemap != null) this.usemap = usemap
		if (onselect != null) this.onselect = onselect
		if (onchange != null) this.onchange = onchange
		if (accept != null) this.accept = accept
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementInput.() -> Unit) = apply(fn)

	var type: SimpleInputType? by DomAttributeAdapter("type", dom, SimpleInputType.text)
	var name: String? by DomAttributeAdapter("name", dom, null as String?)
	var value: String? by DomAttributeAdapter("value", dom, null as String?)
	var checked: AttrTypeInputChecked? by DomAttributeAdapter("checked", dom, null as AttrTypeInputChecked?)
	var disabled: AttrTypeInputDisabled? by DomAttributeAdapter("disabled", dom, null as AttrTypeInputDisabled?)
	var readonly: AttrTypeInputReadonly? by DomAttributeAdapter("readonly", dom, null as AttrTypeInputReadonly?)
	var size: String? by DomAttributeAdapter("size", dom, null as String?)
	var maxlength: SimpleNumber? by DomAttributeAdapter("maxlength", dom, null as SimpleNumber?)
	var src: SimpleURI? by DomAttributeAdapter("src", dom, null as SimpleURI?)
	var alt: String? by DomAttributeAdapter("alt", dom, null as String?)
	var usemap: SimpleURI? by DomAttributeAdapter("usemap", dom, null as SimpleURI?)
	var onselect: SimpleScript? by DomAttributeAdapter("onselect", dom, null as SimpleScript?)
	var onchange: SimpleScript? by DomAttributeAdapter("onchange", dom, null as SimpleScript?)
	var accept: SimpleContentTypes? by DomAttributeAdapter("accept", dom, null as SimpleContentTypes?)


	operator fun plus(dom: DomElement) = this
}
