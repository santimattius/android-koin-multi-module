package com.santimattius.koin.multimodule.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.santimattius.koin.multimodule.data.ApplicationData
import com.santimattius.koin.shared.ComposableActivity
import com.santimattius.koin.shared.ComposablePreview
import org.koin.androidx.compose.get

class MainActivity : ComposableActivity() {

    @Composable
    override fun content() {
        MainScreen()
    }
}

@Composable
private fun MainScreen() {
    val data = get<ApplicationData>()
    val uriHandler = LocalUriHandler.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Greeting(name = data.message())
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { uriHandler.openUri("module://first_module") }) {
            Text(text = "Go to first module")
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { uriHandler.openUri("module://second_module") }) {
            Text(text = "Go to second module")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = name)
}

@Preview
@Composable
fun MainScreenPreview() {
    ComposablePreview {
        MainScreen()
    }
}
