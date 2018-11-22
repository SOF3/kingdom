package io.github.sof3.kingdom.hclib.generator

import org.w3c.dom.Node
import org.w3c.dom.NodeList

inline fun <R> loop(nodeList: NodeList, fn: (Node) -> R): ThenElse<R> {
	var run = false
	var r: R? = null
	for (i in 0 until nodeList.length) {
		r = fn(nodeList.item(i))
		run = true
	}
	return ThenElse(run, r)
}

fun Node.firstChild(name: String, namespace: String = XS_URI): Node? {
	loop(childNodes) {
		if (it.namespaceURI == namespace && it.localName == name) return it
	}
	return null
}

inline fun <R> Node.firstChild(name: String, namespace: String = XS_URI, then: (Node) -> R): ThenElse<R> {
	val child = this@firstChild.firstChild(name, namespace)
	if (child != null) {
		val r = then(child)
		return ThenElse(true, r)
	}
	return ThenElse(false, null)
}

inline fun Node.children(name: String, namespace: String = XS_URI, fn: (Node) -> Unit) = loop(childNodes) {
	if (it.namespaceURI == namespace && it.localName == name) fn(it)
}

fun Node.dfs(pathNodes: Set<String>, leafNodes: Set<String>, fn: (Node) -> Unit) {
	loop(childNodes) { node ->
		if (node.localName in pathNodes) {
			node.dfs(pathNodes, leafNodes, fn)
		} else if (node.localName in leafNodes) {
			fn(node)
		}
	}
}

operator fun Node.get(name: String): String? {
	return attributes.getNamedItem(name)?.nodeValue
}
