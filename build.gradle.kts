buildscript {
    repositories {
        mavenCentral()
        google()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.46.1")
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") version "1.8.20" apply false
    id("com.android.application") version "8.0.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
    id("org.jetbrains.kotlin.jvm") version "1.8.20" apply false
}