package com.santimattius.koin.multimodule

import android.app.Application
import com.santimattius.koin.koin_multi_module.initKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {

        }
    }
}