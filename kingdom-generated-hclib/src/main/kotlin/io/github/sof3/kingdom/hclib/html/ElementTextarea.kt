@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * multi-line text field
 */
class ElementTextarea(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), AttrGroupFocus by AttrGroupFocusImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "textarea"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, accesskey: SimpleCharacter? = null, tabindex: SimpleTabindexNumber? = null, onfocus: SimpleScript? = null, onblur: SimpleScript? = null, name: String? = null, rows: SimpleNumber? = null, cols: SimpleNumber? = null, disabled: AttrTypeTextareaDisabled? = null, readonly: AttrTypeTextareaReadonly? = null, onselect: SimpleScript? = null, onchange: SimpleScript? = null, fn: ElementTextarea.() -> Unit = {}): ElementTextarea {
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
		if (rows != null) this.rows = rows
		if (cols != null) this.cols = cols
		if (disabled != null) this.disabled = disabled
		if (readonly != null) this.readonly = readonly
		if (onselect != null) this.onselect = onselect
		if (onchange != null) this.onchange = onchange
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementTextarea.() -> Unit) = apply(fn)

	var name: String? by DomAttributeAdapter("name", dom, null as String?)
	var rows: SimpleNumber? by DomAttributeAdapter("rows", dom, null as SimpleNumber?)
	var cols: SimpleNumber? by DomAttributeAdapter("cols", dom, null as SimpleNumber?)
	var disabled: AttrTypeTextareaDisabled? by DomAttributeAdapter("disabled", dom, null as AttrTypeTextareaDisabled?)
	var readonly: AttrTypeTextareaReadonly? by DomAttributeAdapter("readonly", dom, null as AttrTypeTextareaReadonly?)
	var onselect: SimpleScript? by DomAttributeAdapter("onselect", dom, null as SimpleScript?)
	var onchange: SimpleScript? by DomAttributeAdapter("onchange", dom, null as SimpleScript?)


	operator fun plusAssign(string: String){
		dom.addPlain(string)
	}
}
