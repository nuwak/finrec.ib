plugins {
    kotlin("jvm") version "1.5.10"
}

group = "github.nuwak"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))}
