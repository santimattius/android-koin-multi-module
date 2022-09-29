package com.santimattius.koin.koin_multi_module

import org.koin.core.module.Module
import java.util.*

class ModuleLoader {
    fun load(): List<Module> {
        val providers = mutableListOf<KoinDependencies>()
        val dependenciesServiceLoader =
            ServiceLoader.load(KoinDependencies::class.java, this.javaClass.classLoader)
        for (provider in dependenciesServiceLoader) {
            providers.add(provider)
        }
        val modules = mutableListOf<Module>()
        providers.sortedBy {
            it.priority().value
        }.forEach { modules.addAll(it.modules()) }
        return modules
    }
}