@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated
import io.github.sof3.kingdom.hclib.KingdomWriter

class ElementObject(internal val dom: DomElementImpl) : AttrGroupAttrs by AttrGroupAttrsImpl(dom), GroupBlock by GroupBlockImpl(dom), GroupInline by GroupInlineImpl(dom), GroupMisc by GroupMiscImpl(dom), DomElement {
	init {
		dom.element = this
	}

	override val elementName = "object"

	fun write(writer: KingdomWriter) = dom.write(writer)

	inline operator fun invoke(id: XsID? = null, classes: List<String>? = null, style: SimpleStyleSheet? = null, title: SimpleText? = null, lang: SimpleLanguageCode? = null, dir: AttrTypeI18nDir? = null, onclick: SimpleScript? = null, ondblclick: SimpleScript? = null, onmousedown: SimpleScript? = null, onmouseup: SimpleScript? = null, onmouseover: SimpleScript? = null, onmousemove: SimpleScript? = null, onmouseout: SimpleScript? = null, onkeypress: SimpleScript? = null, onkeydown: SimpleScript? = null, onkeyup: SimpleScript? = null, declare: AttrTypeObjectDeclare? = null, classid: SimpleURI? = null, codebase: SimpleURI? = null, data: SimpleURI? = null, type: SimpleContentType? = null, codetype: SimpleContentType? = null, archive: SimpleUriList? = null, standby: SimpleText? = null, height: SimpleLength? = null, width: SimpleLength? = null, usemap: SimpleURI? = null, name: XsNMTOKEN? = null, tabindex: SimpleTabindexNumber? = null, fn: ElementObject.() -> Unit = {}): ElementObject {
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
		if (declare != null) this.declare = declare
		if (classid != null) this.classid = classid
		if (codebase != null) this.codebase = codebase
		if (data != null) this.data = data
		if (type != null) this.type = type
		if (codetype != null) this.codetype = codetype
		if (archive != null) this.archive = archive
		if (standby != null) this.standby = standby
		if (height != null) this.height = height
		if (width != null) this.width = width
		if (usemap != null) this.usemap = usemap
		if (name != null) this.name = name
		if (tabindex != null) this.tabindex = tabindex
		fn(this)
		return this
	}

	inline operator fun invoke(fn: ElementObject.() -> Unit) = apply(fn)

	var declare: AttrTypeObjectDeclare? by DomAttributeAdapter("declare", dom, null as AttrTypeObjectDeclare?)
	var classid: SimpleURI? by DomAttributeAdapter("classid", dom, null as SimpleURI?)
	var codebase: SimpleURI? by DomAttributeAdapter("codebase", dom, null as SimpleURI?)
	var data: SimpleURI? by DomAttributeAdapter("data", dom, null as SimpleURI?)
	var type: SimpleContentType? by DomAttributeAdapter("type", dom, null as SimpleContentType?)
	var codetype: SimpleContentType? by DomAttributeAdapter("codetype", dom, null as SimpleContentType?)
	var archive: SimpleUriList? by DomAttributeAdapter("archive", dom, null as SimpleUriList?)
	var standby: SimpleText? by DomAttributeAdapter("standby", dom, null as SimpleText?)
	var height: SimpleLength? by DomAttributeAdapter("height", dom, null as SimpleLength?)
	var width: SimpleLength? by DomAttributeAdapter("width", dom, null as SimpleLength?)
	var usemap: SimpleURI? by DomAttributeAdapter("usemap", dom, null as SimpleURI?)
	var name: XsNMTOKEN? by DomAttributeAdapter("name", dom, null as XsNMTOKEN?)
	var tabindex: SimpleTabindexNumber? by DomAttributeAdapter("tabindex", dom, null as SimpleTabindexNumber?)

	val param get() = ElementParam(DomElementImpl(dom))
	val form get() = ElementForm(DomElementImpl(dom))

	operator fun String.unaryPlus(): ElementObject {
		plusAssign(this)
		return this@ElementObject
	}

	operator fun plusAssign(string: String){
		dom.addPlain(string)
	}

	operator fun plus(dom: DomElement) = this
}
