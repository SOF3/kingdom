@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * The fieldset element is used to group form fields.
 * Only one legend element should occur in the content
 * and if present should only be preceded by whitespace.
 * NOTE: this content model is different from the XHTML 1.0 DTD,
 * closer to the intended content model in HTML4 DTD
 */
class ElementFieldset(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), GroupBlock by GroupBlockImpl(dom), GroupInline by GroupInlineImpl(dom), GroupMisc by GroupMiscImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "fieldset"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, fn: ElementFieldset.() -> Unit = {}): ElementFieldset {
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
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementFieldset.() -> Unit) = apply(fn)


	val legend get() = ElementLegend(DomElementImpl(dom))
	val form get() = ElementForm(DomElementImpl(dom))

	operator fun plusAssign(string: String){
		dom.addPlain(string)
	}
}
