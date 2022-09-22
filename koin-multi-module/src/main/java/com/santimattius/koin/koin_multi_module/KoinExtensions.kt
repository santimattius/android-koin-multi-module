package com.santimattius.koin.koin_multi_module

import android.app.Application
import com.santimattius.koin.koin_multi_module.initKoin as koinInitialize

fun Application.initKoin(init: KoinApplicationWrapper.() -> Unit) {
    koinInitialize(this, init)
}