package com.ashish.poptext

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.platform.LocalContext

/**
 * Created by Ashish Kr on 21,June,2025
 */
@Composable
fun PopText(){
    Text(
        text = "Text Value",
//        modifier = mo,
        color = Red
    )
}

@Composable
fun ButtonGreen(){
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context,"Button Clicked",Toast.LENGTH_SHORT).show()
    }) {
        Text(text = "Green Button", color = Green)

    }
}