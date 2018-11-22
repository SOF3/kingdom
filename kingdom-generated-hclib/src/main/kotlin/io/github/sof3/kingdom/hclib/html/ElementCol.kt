@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * col elements define the alignment properties for cells in
 * one or more columns.
 * The width attribute specifies the width of the columns, e.g.
 * width=64        width in screen pixels
 * width=0.5*      relative width of 0.5
 * The span attribute causes the attributes of one
 * col element to apply to more than one column.
 */
class ElementCol(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), AttrGroupCellhalign by AttrGroupCellhalignImpl(dom), AttrGroupCellvalign by AttrGroupCellvalignImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "col"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, align: AttrTypeCellhalignAlign? = null, char: SimpleCharacter? = null, charoff: SimpleLength? = null, valign: AttrTypeCellvalignValign? = null, span: SimpleNumber? = null, width: SimpleMultiLength? = null, fn: ElementCol.() -> Unit = {}): ElementCol {
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
		if (span != null) this.span = span
		if (width != null) this.width = width
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementCol.() -> Unit) = apply(fn)

	var span: SimpleNumber? by DomAttributeAdapter("span", dom, 1)
	var width: SimpleMultiLength? by DomAttributeAdapter("width", dom, null as SimpleMultiLength?)


	operator fun plus(dom: DomElement) = this
}
