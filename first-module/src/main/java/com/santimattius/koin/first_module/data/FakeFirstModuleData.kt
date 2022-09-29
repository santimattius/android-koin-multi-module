package com.santimattius.koin.first_module.data

class FakeFirstModuleData : FirstModuleData {
    override fun sayHello(name: String): String {
        return "Hello $name, welcome to second module."
    }
}