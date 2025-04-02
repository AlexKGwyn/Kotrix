import org.gradle.model.internal.core.ModelNodes.withType

pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

plugins {
    kotlin("jvm") version "1.9.20" apply false
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

rootProject.name = "kotrix"
