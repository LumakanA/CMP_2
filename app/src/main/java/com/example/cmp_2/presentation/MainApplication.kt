package com.example.cmp_2.presentation

import android.app.Application
import com.example.cmp_2.di.appModule
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            appModule
        }
    }
}
