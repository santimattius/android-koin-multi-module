package com.santimattius.koin.shared

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.santimattius.koin.shared.ui.theme.KoinMultiModuleTheme

@Composable
fun ComposablePreview(content: @Composable () -> Unit) {
    KoinMultiModuleTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background) {
            ScaffoldScreen {
                content()
            }
        }
    }
}