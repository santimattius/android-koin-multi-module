# Koin multi module
Using Koin into modular app

## Architecture


## Provide Koin definitions

Implement KoinDependencies interfaces for example:

```kotlin

cclass FirstModuleDependencies : KoinDependencies {

    override fun scope(): ModuleScope = ModuleScope.FEATURE

    override fun modules(): List<Dependencies> {
        return listOf(
            module {
                single<FirstModuleData> { FakeFirstModuleData() }
            }
        )
    }
}

```

and configure your scope (APP, FEATURE, LIBRARY, CORE), default value is NONE.

## Provide yours definitions using ServiceLoader

Create META-INF.services y your module or app.

Path: resources>META-INF>services and new file with name com.santimattius.koin.koin_multi_module.KoinDependencies.


## Configure your MainApplication

Into onCreate method in application class define:

```kotlin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            // OPTIONAL: App module definition
            module(module = org.koin.dsl.module {
                factory { ApplicationData() }
            })
        }
    }
}

```

