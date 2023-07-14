package com.example

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
internal class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}