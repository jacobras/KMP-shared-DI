plugins {
    kotlin("multiplatform")
    kotlin("kapt")
    id("com.android.application")
    id("com.google.dagger.hilt.android")
}

kotlin {
    android()
    jvmToolchain(17)

    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation("com.google.dagger:hilt-android:2.46.1")
                configurations.getByName("kapt").dependencies.add(
                    org.gradle.api.internal.artifacts.dependencies.DefaultExternalModuleDependency(
                        "com.google.dagger",
                        "hilt-compiler",
                        "2.46.1"
                    )
                )
                implementation("io.insert-koin:koin-android:3.2.0")

                // Specify Lifecycle dependency manually to fix a dependency resolution issue
                implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")

                implementation(project(":shared"))
            }
        }
    }
}

android {
    namespace = "com.example.shared"
    compileSdk = 33

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
}