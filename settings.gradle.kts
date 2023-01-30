include("media")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("com.android.library") version "7.4.0"
        id("org.jlleitschuh.gradle.ktlint") version "11.1.0"
        kotlin("android") version "1.8.0"
        id("org.sonarqube") version "3.4.0.2513"
    }
}
