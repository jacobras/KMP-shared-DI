package com.example

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.koin.core.context.loadKoinModules
import org.koin.java.KoinJavaComponent.get

@Module
@InstallIn(SingletonComponent::class)
class SharedModule {

    @Provides
    fun printer(): SharedPrinter {
        return get(SharedPrinter::class.java)
    }

    companion object {
        fun init() {
            loadKoinModules(sharedModule)
        }
    }
}