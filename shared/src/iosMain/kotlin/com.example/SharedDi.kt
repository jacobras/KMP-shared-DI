package com.example

import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.context.startKoin

class SharedDi : KoinComponent {
    init {
        startKoin {
            modules(sharedModule)
        }
    }

    fun sharedPrinter(): SharedPrinter = get()
}