@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

/**
 * horizontal alignment attributes for cell contents
 * char        alignment char, e.g. char=':'
 * charoff     offset for alignment char
 */
interface AttrGroupCellhalign : DomAttributeGroup {
	/**
	 * horizontal alignment attributes for cell contents
	 * char        alignment char, e.g. char=':'
	 * charoff     offset for alignment char
	 */
	var align: AttrTypeCellhalignAlign?
	/**
	 * horizontal alignment attributes for cell contents
	 * char        alignment char, e.g. char=':'
	 * charoff     offset for alignment char
	 */
	var char: SimpleCharacter?
	/**
	 * horizontal alignment attributes for cell contents
	 * char        alignment char, e.g. char=':'
	 * charoff     offset for alignment char
	 */
	var charoff: SimpleLength?
}
