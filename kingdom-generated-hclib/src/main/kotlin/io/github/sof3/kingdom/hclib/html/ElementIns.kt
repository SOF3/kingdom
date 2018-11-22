@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

class ElementIns(internal val dom: DomElementImpl) : ComplexFlow by ComplexFlowImpl(dom), AttrGroupAttrs by AttrGroupAttrsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "ins"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, cite: SimpleURI? = null, datetime: SimpleDatetime? = null, fn: ElementIns.() -> Unit = {}): ElementIns {
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
		if (cite != null) this.cite = cite
		if (datetime != null) this.datetime = datetime
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementIns.() -> Unit) = apply(fn)

	var cite: SimpleURI? by DomAttributeAdapter("cite", dom, null as SimpleURI?)
	var datetime: SimpleDatetime? by DomAttributeAdapter("datetime", dom, null as SimpleDatetime?)


	override fun plus(dom: DomElement) = this
}
