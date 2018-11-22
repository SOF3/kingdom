@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * generic metainformation
 */
class ElementMeta(internal val dom: DomElementImpl) : AttrGroupI18n by AttrGroupI18nImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "meta"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, id: XsID? = null, httpEquiv: String? = null, name: String? = null, content: String? = null, scheme: String? = null, fn: ElementMeta.() -> Unit = {}): ElementMeta {
		if (lang != null) this.lang = lang
		if (dir != null) this.dir = dir
		if (id != null) this.id = id
		if (httpEquiv != null) this.httpEquiv = httpEquiv
		if (name != null) this.name = name
		if (content != null) this.content = content
		if (scheme != null) this.scheme = scheme
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementMeta.() -> Unit) = apply(fn)

	var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)
	var httpEquiv: String? by DomAttributeAdapter("http-equiv", dom, null as String?)
	var name: String? by DomAttributeAdapter("name", dom, null as String?)
	var content: String? by DomAttributeAdapter("content", dom, null as String?)
	var scheme: String? by DomAttributeAdapter("scheme", dom, null as String?)


}
