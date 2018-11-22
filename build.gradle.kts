import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorExtension
import org.gradle.internal.impldep.org.testng.reporters.XMLUtils.xml
import org.gradle.testing.jacoco.tasks.JacocoReport
import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorPlugin
import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorExtension.Generator
import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorTask
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Style

group = "io.github.sof3.kingdom"
version = "1.0.0-SNAPSHOT"

buildscript {
	repositories {
		jcenter()
	}
	dependencies {
		classpath("com.vanniktech:gradle-dependency-graph-generator-plugin:0.5.0")
	}
}

plugins {
	jacoco
	id("com.vanniktech.dependency.graph.generator") version "0.5.0"
}

val graphMineDepGraphGenerator = Generator(
		dependencyNode = { node, dependency ->
			if (dependency.moduleGroup.startsWith("io.github.sof3.graphmine"))
				node.add(Style.FILLED, Color.rgb("#cbff2b"))
			if (dependency.moduleGroup.startsWith("org.jetbrains.kotlin"))
				node.add(Style.FILLED, Color.rgb("#f2831e"))
			else node
		}
)

configure<DependencyGraphGeneratorExtension> {
	generators = listOf(graphMineDepGraphGenerator)
}

tasks.withType<JacocoReport> {
	reports {
		xml.isEnabled = true
		xml.destination = File("build/reports/jacoco.xml")
		executionData(tasks.withType<Test>())
	}
}

tasks {
	task("codeCoverageReport", type = JacocoReport::class) {
		subprojects.forEach {
			dependsOn(":${it.name}:test")
		}
	}
}
