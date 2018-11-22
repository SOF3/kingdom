@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * Content is "Flow" excluding a, form and form controls
 */
class ElementButton(internal val dom: DomElementImpl) : ComplexButtonContent by ComplexButtonContentImpl(dom), AttrGroupAttrs by AttrGroupAttrsImpl(dom), AttrGroupFocus by AttrGroupFocusImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "button"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, accesskey: SimpleCharacter? = null, tabindex: SimpleTabindexNumber? = null, onfocus: SimpleScript? = null, onblur: SimpleScript? = null, name: String? = null, value: String? = null, type: AttrTypeType? = null, disabled: AttrTypeDisabled? = null, fn: ElementButton.() -> Unit = {}): ElementButton {
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
		if (name != null) this.name = name
		if (value != null) this.value = value
		if (type != null) this.type = type
		if (disabled != null) this.disabled = disabled
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementButton.() -> Unit) = apply(fn)

	var name: String? by DomAttributeAdapter("name", dom, null as String?)
	var value: String? by DomAttributeAdapter("value", dom, null as String?)
	var type: AttrTypeType? by DomAttributeAdapter("type", dom, AttrTypeType.submit)
	var disabled: AttrTypeDisabled? by DomAttributeAdapter("disabled", dom, null as AttrTypeDisabled?)


	override fun plus(dom: DomElement) = this
}
