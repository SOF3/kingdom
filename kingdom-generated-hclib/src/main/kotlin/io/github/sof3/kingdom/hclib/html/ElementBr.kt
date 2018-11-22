@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * forced line break
 */
class ElementBr(internal val dom: DomElementImpl) : AttrGroupCoreattrs by AttrGroupCoreattrsImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "br"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, fn: ElementBr.() -> Unit = {}): ElementBr {
		if (id != null) this.id = id
		if (classes != null) this.classes = XsNMTOKENS(classes)
		if (style != null) this.style = style
		if (title != null) this.title = title
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementBr.() -> Unit) = apply(fn)



	operator fun plus(dom: DomElement) = this
}
