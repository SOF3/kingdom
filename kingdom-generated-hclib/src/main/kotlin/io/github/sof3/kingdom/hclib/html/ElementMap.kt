@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

class ElementMap(internal val dom: DomElementImpl) : AttrGroupI18n by AttrGroupI18nImpl(dom), AttrGroupEvents by AttrGroupEventsImpl(dom), GroupBlock by GroupBlockImpl(dom), GroupMisc by GroupMiscImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "map"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, id: XsID? = null, classes: String? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, name: XsNMTOKEN? = null, fn: ElementMap.() -> Unit = {}): ElementMap {
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
		if (id != null) this.id = id
		if (classes != null) this.classes = classes
		if (style != null) this.style = style
		if (title != null) this.title = title
		if (name != null) this.name = name
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementMap.() -> Unit) = apply(fn)

	var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)
	var classes: String? by DomAttributeAdapter("class", dom, null as String?)
	var style: SimpleStyleSheet? by DomAttributeAdapter("style", dom, null as SimpleStyleSheet?)
	var title: SimpleText? by DomAttributeAdapter("title", dom, null as SimpleText?)
	var name: XsNMTOKEN? by DomAttributeAdapter("name", dom, null as XsNMTOKEN?)

	val form get() = ElementForm(DomElementImpl(dom))
	val area get() = ElementArea(DomElementImpl(dom))

}
