// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    extra.apply {
        set("room_version", "2.6.1")
        set("dagger_version", "2.51.1")
        set("hilt_version", "1.2.0")
        set("nav_version", "2.7.7")
        set("lifecycle_version", "2.7.0")
    }
    repositories {
        google()
    }
}
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.android.library") version "8.1.4" apply false
    kotlin("kapt") version "1.9.0"
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}