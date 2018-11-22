@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * selectable choice
 */
class ElementOption(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "option"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, selected: AttrTypeOptionSelected? = null, disabled: AttrTypeOptionDisabled? = null, label: SimpleText? = null, value: String? = null, fn: ElementOption.() -> Unit = {}): ElementOption {
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
		if (selected != null) this.selected = selected
		if (disabled != null) this.disabled = disabled
		if (label != null) this.label = label
		if (value != null) this.value = value
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementOption.() -> Unit) = apply(fn)

	var selected: AttrTypeOptionSelected? by DomAttributeAdapter("selected", dom, null as AttrTypeOptionSelected?)
	var disabled: AttrTypeOptionDisabled? by DomAttributeAdapter("disabled", dom, null as AttrTypeOptionDisabled?)
	var label: SimpleText? by DomAttributeAdapter("label", dom, null as SimpleText?)
	var value: String? by DomAttributeAdapter("value", dom, null as String?)


	operator fun String.unaryPlus(): ElementOption {
		plusAssign(this)
		return this@ElementOption
	}

	operator fun plusAssign(string: String){
		dom.addPlain(string)
	}

	operator fun plus(dom: DomElement) = this
}
