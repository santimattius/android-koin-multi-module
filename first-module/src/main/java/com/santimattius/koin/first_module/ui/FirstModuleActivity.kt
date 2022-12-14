package com.santimattius.koin.first_module.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.santimattius.koin.first_module.data.FirstModuleData
import com.santimattius.koin.shared.ComposableActivity
import org.koin.androidx.compose.get

class FirstModuleActivity : ComposableActivity() {

    @Composable
    override fun content() {
        val data = get<FirstModuleData>()
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()) {
            Greeting(message = data.sayHello("Android"))
        }
    }
}

@Composable
fun Greeting(message: String) {
    Text(text = message)
}