@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

/**
 * attributes for elements that can get the focus
 * accesskey   accessibility key character
 * tabindex    position in tabbing order
 * onfocus     the element got the focus
 * onblur      the element lost the focus
 */
interface AttrGroupFocus : DomAttributeGroup {
	/**
	 * attributes for elements that can get the focus
	 * accesskey   accessibility key character
	 * tabindex    position in tabbing order
	 * onfocus     the element got the focus
	 * onblur      the element lost the focus
	 */
	var accesskey: SimpleCharacter?
	/**
	 * attributes for elements that can get the focus
	 * accesskey   accessibility key character
	 * tabindex    position in tabbing order
	 * onfocus     the element got the focus
	 * onblur      the element lost the focus
	 */
	var tabindex: SimpleTabindexNumber?
	/**
	 * attributes for elements that can get the focus
	 * accesskey   accessibility key character
	 * tabindex    position in tabbing order
	 * onfocus     the element got the focus
	 * onblur      the element lost the focus
	 */
	var onfocus: SimpleScript?
	/**
	 * attributes for elements that can get the focus
	 * accesskey   accessibility key character
	 * tabindex    position in tabbing order
	 * onfocus     the element got the focus
	 * onblur      the element lost the focus
	 */
	var onblur: SimpleScript?
}
