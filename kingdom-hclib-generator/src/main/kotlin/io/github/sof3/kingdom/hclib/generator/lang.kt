package io.github.sof3.kingdom.hclib.generator

inline fun <T> T?.ifNotNull(fn: (T) -> Unit) {
	if (this != null) fn(this)
}

fun String.ucFirst() =
		if (isEmpty()) ""
		else this[0].toUpperCase() + substring(1)

fun String.lcFirst() =
		if (isEmpty()) ""
		else this[0].toLowerCase() + substring(1)

fun String.formatToPascal() = ucFirst().replace(Regex("[._-]([a-z])")) { it.groupValues[1].toUpperCase() }
fun String.formatToCamel() = lcFirst().replace(Regex("[._-]([a-z])")) { it.groupValues[1].toUpperCase() }
