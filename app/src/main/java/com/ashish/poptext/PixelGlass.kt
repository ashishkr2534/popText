package com.ashish.poptext

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.ashish.poptext.R


/**
 * Created by Ashish Kr on 27,June,2025
 */
//@Composable
//fun GlassCard(
//    modifier: Modifier = Modifier,
//    cornerRadius: Dp = 16.dp,
//    blurRadius: Dp = 20.dp,
//    backgroundColor: Color = Color.White.copy(alpha = 0.1f)
//) {
//    Box(
//        modifier = modifier
//            .clip(RoundedCornerShape(cornerRadius))
//            .background(backgroundColor)
//            .blur(blurRadius)
//            .border(
//                width = 1.dp,
//                color = Color.White.copy(alpha = 0.2f),
//                shape = RoundedCornerShape(cornerRadius)
//            )
//            .padding(24.dp)
//    ) {
//        Text(
//            text = "Glassmorphic UI",
//            color = Color.White,
//            style = MaterialTheme.typography.titleMedium
//        )
//    }
//}

//@Composable
//fun GlassEffectScreen() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                brush = Brush.linearGradient(
//                    colors = listOf(Color(0xFF6A11CB), Color(0xFF2575FC))
//                )
//            )
//    ) {
//        Image(
//            painter = painterResource(id =  R.drawable.qrpuzzy_blacklogo),
//            contentDescription = "Background Image",
//            modifier = Modifier.fillMaxSize(),
//            contentScale = ContentScale.Crop, // Ensures it fills the background properly
////                alpha = 0.9f
//        )
//
//        GlassCard(
//            modifier = Modifier
//                .align(Alignment.Center)
//                .width(300.dp)
//                .height(180.dp)
//        )
//    }
//}

//@Preview
//@Composable
//fun PreviewPixelGlass(){
//    GlassEffectScreen()
//}