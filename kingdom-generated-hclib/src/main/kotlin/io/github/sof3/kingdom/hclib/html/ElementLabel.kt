@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * Each label must not contain more than ONE field
 * Label elements shouldn't be nested.
 */
class ElementLabel(internal val dom: DomElementImpl) : ComplexInline by ComplexInlineImpl(dom), AttrGroupAttrs by AttrGroupAttrsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "label"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, forTarget: XsIDREF? = null, accesskey: SimpleCharacter? = null, onfocus: SimpleScript? = null, onblur: SimpleScript? = null, fn: ElementLabel.() -> Unit = {}): ElementLabel {
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
		if (forTarget != null) this.forTarget = forTarget
		if (accesskey != null) this.accesskey = accesskey
		if (onfocus != null) this.onfocus = onfocus
		if (onblur != null) this.onblur = onblur
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementLabel.() -> Unit) = apply(fn)

	var forTarget: XsIDREF? by DomAttributeAdapter("for", dom, null as XsIDREF?)
	var accesskey: SimpleCharacter? by DomAttributeAdapter("accesskey", dom, null as SimpleCharacter?)
	var onfocus: SimpleScript? by DomAttributeAdapter("onfocus", dom, null as SimpleScript?)
	var onblur: SimpleScript? by DomAttributeAdapter("onblur", dom, null as SimpleScript?)


	override fun plus(dom: DomElement) = this
}
