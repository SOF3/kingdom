@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * option selector
 */
class ElementSelect(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "select"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, name: String? = null, size: SimpleNumber? = null, multiple: AttrTypeSelectMultiple? = null, disabled: AttrTypeSelectDisabled? = null, tabindex: SimpleTabindexNumber? = null, onfocus: SimpleScript? = null, onblur: SimpleScript? = null, onchange: SimpleScript? = null, fn: ElementSelect.() -> Unit = {}): ElementSelect {
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
		if (name != null) this.name = name
		if (size != null) this.size = size
		if (multiple != null) this.multiple = multiple
		if (disabled != null) this.disabled = disabled
		if (tabindex != null) this.tabindex = tabindex
		if (onfocus != null) this.onfocus = onfocus
		if (onblur != null) this.onblur = onblur
		if (onchange != null) this.onchange = onchange
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementSelect.() -> Unit) = apply(fn)

	var name: String? by DomAttributeAdapter("name", dom, null as String?)
	var size: SimpleNumber? by DomAttributeAdapter("size", dom, null as SimpleNumber?)
	var multiple: AttrTypeSelectMultiple? by DomAttributeAdapter("multiple", dom, null as AttrTypeSelectMultiple?)
	var disabled: AttrTypeSelectDisabled? by DomAttributeAdapter("disabled", dom, null as AttrTypeSelectDisabled?)
	var tabindex: SimpleTabindexNumber? by DomAttributeAdapter("tabindex", dom, null as SimpleTabindexNumber?)
	var onfocus: SimpleScript? by DomAttributeAdapter("onfocus", dom, null as SimpleScript?)
	var onblur: SimpleScript? by DomAttributeAdapter("onblur", dom, null as SimpleScript?)
	var onchange: SimpleScript? by DomAttributeAdapter("onchange", dom, null as SimpleScript?)

	val optgroup get() = ElementOptgroup(DomElementImpl(dom))
	val option get() = ElementOption(DomElementImpl(dom))

}
