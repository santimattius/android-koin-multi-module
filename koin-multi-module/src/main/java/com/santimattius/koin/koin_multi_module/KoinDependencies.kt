package com.santimattius.koin.koin_multi_module

import org.koin.core.module.Module

typealias Dependencies = Module


interface KoinDependencies {
    fun modules(): List<Module>
    fun priority() = ModuleDefinition.NONE
}

enum class ModuleDefinition(val value: Int) {
    CORE(1),
    LIBRARY(2),
    FEATURE(3),
    NONE(4),
}