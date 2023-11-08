include("media")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("com.android.library") version "8.1.3"
        id("org.jlleitschuh.gradle.ktlint") version "11.6.1"
        kotlin("android") version "1.9.10"
        id("org.sonarqube") version "3.4.0.2513"
    }
}
