# Koin multi module
Using Koin into modular app

## Architecture

<p align="center">
  <img width="600" src="https://github.com/santimattius/android-koin-multi-module/blob/master/images/architecture.png?raw=true" alt="App Capture"/>
</p>

## Provide Koin definitions

Implement KoinDependencies interfaces for example:

```kotlin

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

```

and configure your scope (APP, FEATURE, LIBRARY, CORE), default value is NONE.

## Provide yours definitions using ServiceLoader

Create META-INF.services y your module or app.

Path: resources>META-INF>services and new file with name com.santimattius.koin.koin_multi_module.KoinDependencies.

<p align="left">
  <img width="800" src="https://github.com/santimattius/android-koin-multi-module/blob/master/images/Captura%20de%20Pantalla%202022-09-29%20a%20la(s)%2020.15.03.png?raw=true" alt="App Capture"/>
</p>

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

## Testing your dependencies graph

.......

