package com.ashish.poptext

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

@Composable
fun PixelButtonPrimary(text: String,onClick: () -> Unit,modifier: Modifier){
    Button(
        onClick = onClick,
        modifier  = modifier,
//        modifier = Modifier.padding(top = 16.dp)
//            .fillMaxWidth(0.8f)
//            .height(46.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00C853)),
        shape = RoundedCornerShape(14.dp),
        elevation = ButtonDefaults.buttonElevation(8.dp)
    ) {
        Text(text, fontFamily = PixelFamilyBold, fontSize = 18.sp, color = White)
    }
}

@Composable
fun PixelButtonDismiss(text: String, onClick: () -> Unit, modifier: Modifier){
    Button(
        onClick = onClick,
        modifier = modifier,
//            .fillMaxWidth(0.8f)
//            .height(46.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF949A96)),
        shape = RoundedCornerShape(14.dp),
        elevation = ButtonDefaults.buttonElevation(8.dp)
    ) {
        Text(text, fontFamily = PixelFamilyBold, fontSize = 18.sp,color = White)
    }
}