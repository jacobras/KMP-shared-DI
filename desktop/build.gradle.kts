plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm { withJava() }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}