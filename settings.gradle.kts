include("media")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("com.android.library") version "8.0.0"
        id("org.jlleitschuh.gradle.ktlint") version "11.3.1"
        kotlin("android") version "1.8.10"
        id("org.sonarqube") version "3.4.0.2513"
    }
}
