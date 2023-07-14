plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm { withJava() }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.insert-koin:koin-core:3.2.0")

                implementation(project(":shared"))
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}