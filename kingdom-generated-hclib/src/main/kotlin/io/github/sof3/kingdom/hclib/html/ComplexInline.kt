@file:Generated("io.github.sof3.kingdom.hclib.generator", comments = "Generated from XHTML schema. Do not edit.")

package io.github.sof3.kingdom.hclib.html

import javax.annotation.Generated

interface ComplexInline : GroupInline, GroupMiscInline {


	operator fun String.unaryPlus(): ComplexInline

	operator fun plusAssign(string: String)

	operator fun plus(dom: DomElement) = this
}
