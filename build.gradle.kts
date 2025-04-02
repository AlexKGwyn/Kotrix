plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka") version "1.9.20"
    id("maven-publish")
}

group = "com.github.alexkgwyn"
version = "1.0.2"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("junit:junit:4.13.1")
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.9.20")
}

tasks {
    withType<Jar> {
        from(sourceSets["main"].allSource)
    }
}