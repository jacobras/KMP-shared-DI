plugins {
    kotlin("multiplatform")
    id("com.android.application")
}

kotlin {
    android()
    jvmToolchain(17)
}

android {
    namespace = "com.example.shared"
    compileSdk = 33

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}