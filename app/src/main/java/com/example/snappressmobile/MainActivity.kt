package com.example.snappressmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.snappressmobile.ui.theme.SnapPressMobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SnapPressMobileTheme {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray) // This colors the entire screen including padding areas
                    .safeDrawingPadding()
                ) {
                    mainWindow()
                    SelectPhotoBtn()
                }
            }
        }
    }
}

@Composable
fun mainWindow(modifier: Modifier = Modifier) {
    Column (modifier = Modifier
        .background(Color.Red)
        .fillMaxWidth()
    ) {
        Text(
            text = "SnapPress Mobile\nAlpha v0.2.0",
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(12.dp)
        )
    }
}

@Composable
fun SelectPhotoBtn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.Green)
            .fillMaxWidth()
    ) {
        Text(
            text = "Here will be button to select photos",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
                .padding(12.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SnapPressMobileTheme {
        Column {
            SelectPhotoBtn()
            mainWindow()
        }
    }
}