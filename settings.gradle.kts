include("media")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("com.android.library") version "7.3.1"
        id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
        kotlin("android") version "1.8.0"
        id("org.sonarqube") version "3.5.0.2730"
    }
}
