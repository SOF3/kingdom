@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

/**
 * internationalization attributes
 * lang        language code (backwards compatible)
 * xml:lang    language code (as per XML 1.0 spec)
 * dir         direction for weak/neutral text
 */
interface AttrGroupI18n : DomAttributeGroup {
	/**
	 * internationalization attributes
	 * lang        language code (backwards compatible)
	 * xml:lang    language code (as per XML 1.0 spec)
	 * dir         direction for weak/neutral text
	 */
	var lang: SimpleLanguageCode?
	/**
	 * internationalization attributes
	 * lang        language code (backwards compatible)
	 * xml:lang    language code (as per XML 1.0 spec)
	 * dir         direction for weak/neutral text
	 */
	var dir: AttrTypeI18nDir?
}
