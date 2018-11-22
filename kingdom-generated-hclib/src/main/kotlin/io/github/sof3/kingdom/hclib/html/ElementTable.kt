@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

class ElementTable(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "table"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, summary: SimpleText? = null, width: SimpleLength? = null, border: SimplePixels? = null, frame: SimpleTFrame? = null, rules: SimpleTRules? = null, cellspacing: SimpleLength? = null, cellpadding: SimpleLength? = null, fn: ElementTable.() -> Unit = {}): ElementTable {
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
		if (summary != null) this.summary = summary
		if (width != null) this.width = width
		if (border != null) this.border = border
		if (frame != null) this.frame = frame
		if (rules != null) this.rules = rules
		if (cellspacing != null) this.cellspacing = cellspacing
		if (cellpadding != null) this.cellpadding = cellpadding
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementTable.() -> Unit) = apply(fn)

	var summary: SimpleText? by DomAttributeAdapter("summary", dom, null as SimpleText?)
	var width: SimpleLength? by DomAttributeAdapter("width", dom, null as SimpleLength?)
	var border: SimplePixels? by DomAttributeAdapter("border", dom, null as SimplePixels?)
	var frame: SimpleTFrame? by DomAttributeAdapter("frame", dom, null as SimpleTFrame?)
	var rules: SimpleTRules? by DomAttributeAdapter("rules", dom, null as SimpleTRules?)
	var cellspacing: SimpleLength? by DomAttributeAdapter("cellspacing", dom, null as SimpleLength?)
	var cellpadding: SimpleLength? by DomAttributeAdapter("cellpadding", dom, null as SimpleLength?)

	val caption get() = ElementCaption(DomElementImpl(dom))
	val col get() = ElementCol(DomElementImpl(dom))
	val colgroup get() = ElementColgroup(DomElementImpl(dom))
	val thead get() = ElementThead(DomElementImpl(dom))
	val tfoot get() = ElementTfoot(DomElementImpl(dom))
	val tbody get() = ElementTbody(DomElementImpl(dom))
	val tr get() = ElementTr(DomElementImpl(dom))

}
