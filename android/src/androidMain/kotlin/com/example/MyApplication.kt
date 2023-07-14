package com.example

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

@HiltAndroidApp
internal class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin { androidContext(this@MyApplication) }
        SharedModule.init()
    }
}