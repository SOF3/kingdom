@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

class AttrGroupI18nImpl(private val dom: DomElementImpl) : AttrGroupI18n, DomAttributeGroup by DomAttributeGroupImpl(dom) {
	override var lang: SimpleLanguageCode? by DomAttributeAdapter("lang", dom, null as SimpleLanguageCode?)
	override var dir: AttrTypeI18nDir? by DomAttributeAdapter("dir", dom, null as AttrTypeI18nDir?)
}
