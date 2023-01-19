@file:OptIn(ExperimentalMaterial3Api::class)

package com.festivalfellow.mobile.app.view.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.festivalfellow.mobile.design.themes.AppTheme

@Composable
fun AppFrame() {
    AppTheme() {
        Scaffold { padding ->
            Column(modifier = Modifier.padding(padding)) {
                Text(text = "Hello World")
            }
        }
    }
}

@Composable
@Preview
private fun AppFramePreview() {
    AppFrame()
}
