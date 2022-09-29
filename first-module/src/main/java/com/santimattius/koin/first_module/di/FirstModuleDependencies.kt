package com.santimattius.koin.first_module.di

import com.santimattius.koin.first_module.data.FakeFirstModuleData
import com.santimattius.koin.first_module.data.FirstModuleData
import com.santimattius.koin.koin_multi_module.Dependencies
import com.santimattius.koin.koin_multi_module.KoinDependencies
import com.santimattius.koin.koin_multi_module.ModuleScope
import org.koin.dsl.module

class FirstModuleDependencies : KoinDependencies {

    override fun scope(): ModuleScope = ModuleScope.FEATURE

    override fun modules(): List<Dependencies> {
        return listOf(
            module {
                single<FirstModuleData> { FakeFirstModuleData() }
            }
        )
    }
}