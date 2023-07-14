plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {
    android()
    jvm()
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