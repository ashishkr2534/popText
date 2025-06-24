package com.ashish.poptext

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Created by Ashish Kr on 24,June,2025
 */
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

@Composable
fun PixelButton(text: String,
                onClick: () -> Unit,
                modifier: Modifier = Modifier,
                textColor: Color = Color.Black,
                fontSize: TextUnit = 18.sp,
                colors: ButtonColors = ButtonDefaults.buttonColors(containerColor = Color.White),
                elevation: ButtonElevation = ButtonDefaults.buttonElevation(8.dp),
                shape: RoundedCornerShape = RoundedCornerShape(14.dp)){
    Button(
        onClick = onClick,
        modifier = modifier,
//            .fillMaxWidth(0.8f)
//            .height(46.dp),
//        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF949A96)),
        shape = shape,
        elevation = elevation,
        colors = colors
    ) {
        Text(text,
            fontFamily = PixelFamilyBold,
            fontSize = fontSize,
            color = textColor)
    }
}