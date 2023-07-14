# KMP-shared-DI

Demonstrates mixing DI frameworks in Kotlin Multiplatform (KMP). This project uses Koin
in the share code, but exposes it in the `androidMain` source set as a Hilt module. This allows
consumers on Android to inject the shared code in Hilt, without being forced to switch to whatever
DI framework the shared code is using.