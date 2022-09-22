package com.santimattius.koin.first_module.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.santimattius.koin.shared.ComposableActivity

class FirstModuleActivity : ComposableActivity({
    Greeting(name = "Android")
})

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}