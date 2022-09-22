package com.santimattius.koin.first_module.di

import com.santimattius.koin.koin_multi_module.Dependencies
import com.santimattius.koin.koin_multi_module.KoinDependencies
import org.koin.dsl.module

class FirstModuleDependencies : KoinDependencies {

    override fun modules(): List<Dependencies> {
        return listOf(
            module {

            }
        )
    }
}