package com.example

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.java.KoinJavaComponent.get

@Module
@InstallIn(SingletonComponent::class)
class SharedModule {

    @Provides
    fun printer(): SharedPrinter {
        return get(SharedPrinter::class.java)
    }

    companion object {
        fun init(context: Context) {
            startKoin {
                androidContext(context)
                modules(sharedModule)
            }
        }
    }
}