plugins {
    kotlin("multiplatform")
    kotlin("kapt")
    id("com.android.library")
    id("com.google.dagger.hilt.android")
}

kotlin {
    android()
    jvm()
    jvmToolchain(17)

    ios()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.insert-koin:koin-core:3.2.0")
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("io.insert-koin:koin-android:3.2.0")

                implementation("com.google.dagger:hilt-android:2.46.1")
                configurations.getByName("kapt").dependencies.add(
                    org.gradle.api.internal.artifacts.dependencies.DefaultExternalModuleDependency(
                        "com.google.dagger",
                        "hilt-compiler",
                        "2.46.1"
                    )
                )
            }
        }
        val iosMain by getting
    }
}

android {
    namespace = "com.example.shared"
    compileSdk = 33

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}