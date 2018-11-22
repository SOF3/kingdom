@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

class ElementTd(internal val dom: DomElementImpl) : ComplexFlow by ComplexFlowImpl(dom), AttrGroupAttrs by AttrGroupAttrsImpl(dom), AttrGroupCellhalign by AttrGroupCellhalignImpl(dom), AttrGroupCellvalign by AttrGroupCellvalignImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "td"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, align: AttrTypeCellhalignAlign? = null, char: SimpleCharacter? = null, charoff: SimpleLength? = null, valign: AttrTypeCellvalignValign? = null, abbr: SimpleText? = null, axis: String? = null, headers: List<String>? = null, scope: SimpleScope? = null, rowspan: SimpleNumber? = null, colspan: SimpleNumber? = null, fn: ElementTd.() -> Unit = {}): ElementTd {
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
		if (align != null) this.align = align
		if (char != null) this.char = char
		if (charoff != null) this.charoff = charoff
		if (valign != null) this.valign = valign
		if (abbr != null) this.abbr = abbr
		if (axis != null) this.axis = axis
		if (headers != null) this.headers = XsIDREFS(headers)
		if (scope != null) this.scope = scope
		if (rowspan != null) this.rowspan = rowspan
		if (colspan != null) this.colspan = colspan
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementTd.() -> Unit) = apply(fn)

	var abbr: SimpleText? by DomAttributeAdapter("abbr", dom, null as SimpleText?)
	var axis: String? by DomAttributeAdapter("axis", dom, null as String?)
	var headers: XsIDREFS? by DomAttributeAdapter("headers", dom, null as XsIDREFS?)
	var scope: SimpleScope? by DomAttributeAdapter("scope", dom, null as SimpleScope?)
	var rowspan: SimpleNumber? by DomAttributeAdapter("rowspan", dom, 1)
	var colspan: SimpleNumber? by DomAttributeAdapter("colspan", dom, 1)


	override fun plus(dom: DomElement) = this
}
