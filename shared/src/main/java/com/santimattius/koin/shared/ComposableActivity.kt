package com.santimattius.koin.shared

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.santimattius.koin.shared.ui.theme.KoinMultiModuleTheme

abstract class ComposableActivity() : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KoinMultiModuleTheme {
                // A surface container using the 'background' color from the theme
                ScaffoldScreen(content = { content() })
            }
        }
    }

    @Composable
    abstract fun content()

}

@Composable
internal fun ScaffoldScreen(content: @Composable () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background) {
        Scaffold(
            topBar = {
                TopAppBar(title = { Text(text = stringResource(id = R.string.title_activity_composable)) })
            }
        ) {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(it)) {
                content()
            }
        }
    }
}
