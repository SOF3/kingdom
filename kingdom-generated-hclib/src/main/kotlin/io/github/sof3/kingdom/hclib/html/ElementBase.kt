@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * document base URI
 */
class ElementBase(internal val dom: DomElementImpl) : DomElement {
	init {
		dom.element = this
	}

	override val elementName = "base"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(href: SimpleURI? = null, id: XsID? = null, fn: ElementBase.() -> Unit = {}): ElementBase {
		if (href != null) this.href = href
		if (id != null) this.id = id
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementBase.() -> Unit) = apply(fn)

	var href: SimpleURI? by DomAttributeAdapter("href", dom, null as SimpleURI?)
	var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)


}
