@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

/**
 * core attributes common to most elements
 * id       document-wide unique id
 * class    space separated list of classes
 * style    associated style info
 * title    advisory title/amplification
 */
interface AttrGroupCoreattrs : DomAttributeGroup {
	/**
	 * core attributes common to most elements
	 * id       document-wide unique id
	 * class    space separated list of classes
	 * style    associated style info
	 * title    advisory title/amplification
	 */
	var id: XsID?
	/**
	 * core attributes common to most elements
	 * id       document-wide unique id
	 * class    space separated list of classes
	 * style    associated style info
	 * title    advisory title/amplification
	 */
	var classes: XsNMTOKENS?
	/**
	 * core attributes common to most elements
	 * id       document-wide unique id
	 * class    space separated list of classes
	 * style    associated style info
	 * title    advisory title/amplification
	 */
	var style: SimpleStyleSheet?
	/**
	 * core attributes common to most elements
	 * id       document-wide unique id
	 * class    space separated list of classes
	 * style    associated style info
	 * title    advisory title/amplification
	 */
	var title: SimpleText?
}
