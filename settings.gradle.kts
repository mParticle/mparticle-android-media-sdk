include("media")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("com.android.library") version "7.4.2"
        id("org.jlleitschuh.gradle.ktlint") version "11.6.0"
        kotlin("android") version "1.9.10"
        id("org.sonarqube") version "4.4.0.3356"
    }
}
