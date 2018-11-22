@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * I18N BiDi over-ride
 */
class ElementBdo(internal val dom: DomElementImpl) : ComplexInline by ComplexInlineImpl(dom), AttrGroupCoreattrs by AttrGroupCoreattrsImpl(dom), AttrGroupEvents by AttrGroupEventsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "bdo"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeDir? = null, fn: ElementBdo.() -> Unit = {}): ElementBdo {
		if (id != null) this.id = id
		if (classes != null) this.classes = XsNMTOKENS(classes)
		if (style != null) this.style = style
		if (title != null) this.title = title
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
		if (lang != null) this.lang = lang
		if (dir != null) this.dir = dir
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementBdo.() -> Unit) = apply(fn)

	var lang: SimpleLanguageCode? by DomAttributeAdapter("lang", dom, null as SimpleLanguageCode?)
	var dir: AttrTypeDir? by DomAttributeAdapter("dir", dom, null as AttrTypeDir?)


	override fun plus(dom: DomElement) = this
}
