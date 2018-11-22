@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * param is used to supply a named property value.
 * In XML it would seem natural to follow RDF and support an
 * abbreviated syntax where the param elements are replaced
 * by attribute value pairs on the object start tag.
 */
class ElementParam(internal val dom: DomElementImpl) : DomElement {
	init {
		dom.element = this
	}

	override val elementName = "param"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, name: String? = null, value: String? = null, valuetype: AttrTypeParamValuetype? = null, type: SimpleContentType? = null, fn: ElementParam.() -> Unit = {}): ElementParam {
		if (id != null) this.id = id
		if (name != null) this.name = name
		if (value != null) this.value = value
		if (valuetype != null) this.valuetype = valuetype
		if (type != null) this.type = type
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementParam.() -> Unit) = apply(fn)

	var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)
	var name: String? by DomAttributeAdapter("name", dom, null as String?)
	var value: String? by DomAttributeAdapter("value", dom, null as String?)
	var valuetype: AttrTypeParamValuetype? by DomAttributeAdapter("valuetype", dom, "data")
	var type: SimpleContentType? by DomAttributeAdapter("type", dom, null as SimpleContentType?)


}
