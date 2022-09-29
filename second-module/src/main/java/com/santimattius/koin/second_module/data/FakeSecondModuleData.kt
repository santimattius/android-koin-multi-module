package com.santimattius.koin.second_module.data

class FakeSecondModuleData : SecondModuleData {
    override fun sayHello(name: String): String {
        return "Hello $name, welcome to second module."
    }
}