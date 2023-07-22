package com.example

/**
 * This will be shared and also injectable.
 */
class SharedPrinter internal constructor(
    private val internalPrinter: InternalPrinter
) {
    fun print(): String {
        return "Shared printer. ${internalPrinter.print()}"
    }
}