package com.santimattius.koin.first_module.di

import com.santimattius.koin.first_module.data.FakeFirstModuleData
import com.santimattius.koin.first_module.data.FirstModuleData
import com.santimattius.koin.koin_multi_module.Dependencies
import com.santimattius.koin.koin_multi_module.KoinDependencies
import com.santimattius.koin.koin_multi_module.ModuleDefinition
import org.koin.dsl.module

class FirstModuleDependencies : KoinDependencies {

    override fun priority(): ModuleDefinition = ModuleDefinition.FEATURE

    override fun modules(): List<Dependencies> {
        return listOf(
            module {
                single<FirstModuleData> { FakeFirstModuleData() }
            }
        )
    }
}