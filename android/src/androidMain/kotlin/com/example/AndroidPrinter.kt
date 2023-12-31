package com.example

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class AndroidPrinter @Inject constructor(
    private val sharedPrinter: SharedPrinter
) {
    fun print(): String {
        return "Android printer. ${sharedPrinter.print()}"
    }
}