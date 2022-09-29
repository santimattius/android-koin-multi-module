package com.santimattius.koin.second_module.di

import com.santimattius.koin.koin_multi_module.Dependencies
import com.santimattius.koin.koin_multi_module.KoinDependencies
import com.santimattius.koin.koin_multi_module.ModuleDefinition
import com.santimattius.koin.second_module.data.FakeSecondModuleData
import com.santimattius.koin.second_module.data.SecondModuleData
import org.koin.dsl.module

class SecondModuleDependencies : KoinDependencies {

    override fun priority(): ModuleDefinition = ModuleDefinition.FEATURE

    override fun modules(): List<Dependencies> {
        return listOf(module {
            single<SecondModuleData> { FakeSecondModuleData() }
        })
    }
}