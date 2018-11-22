@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

/**
 * script statements, which may include CDATA sections
 */
class ElementScript(internal val dom: DomElementImpl) : DomElement {
	init {
		dom.element = this
	}

	override val elementName = "script"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, charset: SimpleCharset? = null, type: SimpleContentType? = null, src: SimpleURI? = null, defer: AttrTypeScriptDefer? = null, fn: ElementScript.() -> Unit = {}): ElementScript {
		if (id != null) this.id = id
		if (charset != null) this.charset = charset
		if (type != null) this.type = type
		if (src != null) this.src = src
		if (defer != null) this.defer = defer
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementScript.() -> Unit) = apply(fn)

	var id: XsID? by DomAttributeAdapter("id", dom, null as XsID?)
	var charset: SimpleCharset? by DomAttributeAdapter("charset", dom, null as SimpleCharset?)
	var type: SimpleContentType? by DomAttributeAdapter("type", dom, null as SimpleContentType?)
	var src: SimpleURI? by DomAttributeAdapter("src", dom, null as SimpleURI?)
	var defer: AttrTypeScriptDefer? by DomAttributeAdapter("defer", dom, null as AttrTypeScriptDefer?)


	operator fun String.unaryPlus(): ElementScript {
		plusAssign(this)
		return this@ElementScript
	}

	operator fun plusAssign(string: String){
		dom.addPlain(string)
	}

	operator fun plus(dom: DomElement) = this
}
