package com.santimattius.koin.multimodule

import android.app.Application
import com.santimattius.koin.koin_multi_module.initKoin
import com.santimattius.koin.multimodule.data.ApplicationData

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            module(module = org.koin.dsl.module {
                factory { ApplicationData() }
            })
        }
    }
}