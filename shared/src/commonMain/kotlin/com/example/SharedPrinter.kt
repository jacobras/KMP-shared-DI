package com.example

/**
 * This will be shared and also injectable.
 */
class SharedPrinter(
    private val internalSharedDependency: InternalSharedPrinter
) {
    fun print(): String {
        return "Shared printer.  ${internalSharedDependency.print()}"
    }
}