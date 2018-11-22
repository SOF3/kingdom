import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.3.10"
}

group = "io.github.sof3.kingdom"
version = "1.0.0-SNAPSHOT"

repositories {
	jcenter()
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
	implementation("commons-io:commons-io:2.6")
}

tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "1.8"
}
