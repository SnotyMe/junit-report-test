val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
	kotlin("jvm") version "1.9.23"
	application
}

group = "me.snoty"
version = "0.0.1"

application {
	mainClass.set("me.snoty.ApplicationKt")
	val isDevelopment: Boolean = project.ext.has("development")
	applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
	implementation("io.ktor:ktor-server-netty:$ktor_version")
	implementation("ch.qos.logback:logback-classic:$logback_version")
	testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
