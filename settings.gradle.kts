include("media")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("com.android.library") version "7.4.2"
        id("org.jlleitschuh.gradle.ktlint") version "11.3.2"
        kotlin("android") version "1.8.10"
        id("org.sonarqube") version "4.2.0.3129"
    }
}
