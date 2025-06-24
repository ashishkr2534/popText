package com.ashish.poptext

import android.widget.Toast
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
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
fun PixelText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = 16.sp,
    fontWeight: FontWeight = FontWeight.Normal,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip
) {
    Text(
        text = text,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = PixelFamilyBold,
        textAlign = textAlign,
        maxLines = maxLines,
        overflow = overflow,
        modifier = modifier
    )
}


//@Composable
//fun PixelButtonPrimary(text: String,onClick: () -> Unit,modifier: Modifier){
//    Button(
//        onClick = onClick,
//        modifier  = modifier,
////        modifier = Modifier.padding(top = 16.dp)
////            .fillMaxWidth(0.8f)
////            .height(46.dp),
//        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00C853)),
//        shape = RoundedCornerShape(14.dp),
//        elevation = ButtonDefaults.buttonElevation(8.dp)
//    ) {
//        Text(text, fontFamily = PixelFamilyBold, fontSize = 18.sp, color = White)
//    }
//}
//
//@Composable
//fun PixelButtonDismiss(text: String, onClick: () -> Unit, modifier: Modifier){
//    Button(
//        onClick = onClick,
//        modifier = modifier,
////            .fillMaxWidth(0.8f)
////            .height(46.dp),
//        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF949A96)),
//        shape = RoundedCornerShape(14.dp),
//        elevation = ButtonDefaults.buttonElevation(8.dp)
//    ) {
//        Text(text, fontFamily = PixelFamilyBold, fontSize = 18.sp,color = White)
//    }
//}

//@Composable
//fun MinecraftPixelCard(modifier: Modifier = Modifier) {
//    val blockSize = 6.dp
//    val cardWidth = 250.dp
//    val cardHeight = 200.dp
//
//    val darkGray = Color(0xFF2E2E2E)
//    val midGray = Color(0xFF4D4D4D)
//    val lightGray = Color(0xFF7A7A7A)
//    val bgColor = Color(0xFFF3EBDD)
//
//    Box(
//        modifier = modifier.padding()
//            .size(cardWidth, cardHeight)
//            .background(bgColor)
//    ) {
//        Canvas(modifier = Modifier.matchParentSize()) {
//            val b = blockSize.toPx()
//            val w = size.width
//            val h = size.height
//
//            fun drawPixel(x: Int, y: Int, color: Color) {
//                drawRect(
//                    color = color,
//                    topLeft = Offset(x * b, y * b),
//                    size = Size(b, b)
//                )
//            }
//
//            // Draw pixel corners (rounded pixelated corners)
//            val cornerPixels = listOf(
//                // Top Left
//                Triple(0, 0,Color.Transparent), Triple(1, 0, midGray), Triple(2, 0, lightGray),
//                Triple(0, 1, midGray), Triple(1, 1, lightGray), Triple(0, 2, lightGray),
////                Triple(0, 1, Color.Transparent), Triple(1, 1, lightGray), Triple(0, 2, lightGray),
//
//                // Top Right
////                Triple(((w - b * 1) / b).toInt(), 0, darkGray),
//                Triple(((w - b * 1) / b).toInt(), 0, Color.Transparent),
//                Triple(((w - b * 2) / b).toInt(), 0, midGray),
//                Triple(((w - b * 3) / b).toInt(), 0, lightGray),
//                Triple(((w - b * 1) / b).toInt(), 1, midGray),
//                Triple(((w - b * 2) / b).toInt(), 1, lightGray),
//                Triple(((w - b * 1) / b).toInt(), 2, lightGray),
//
//                // Bottom Left
////                Triple(0, ((h - b * 1) / b).toInt(), darkGray),
//                Triple(0, ((h - b * 1) / b).toInt(), Color.Transparent),
//                Triple(1, ((h - b * 1) / b).toInt(), midGray),
//                Triple(2, ((h - b * 1) / b).toInt(), lightGray),
//                Triple(0, ((h - b * 2) / b).toInt(), midGray),
//                Triple(1, ((h - b * 2) / b).toInt(), lightGray),
//                Triple(0, ((h - b * 3) / b).toInt(), lightGray),
//
//                // Bottom Right
////                Triple(((w - b * 1) / b).toInt(), ((h - b * 1) / b).toInt(), darkGray),
//                Triple(((w - b * 1) / b).toInt(), ((h - b * 1) / b).toInt(), Color.Transparent),
//                Triple(((w - b * 2) / b).toInt(), ((h - b * 1) / b).toInt(), midGray),
//                Triple(((w - b * 3) / b).toInt(), ((h - b * 1) / b).toInt(), lightGray),
//                Triple(((w - b * 1) / b).toInt(), ((h - b * 2) / b).toInt(), midGray),
//                Triple(((w - b * 2) / b).toInt(), ((h - b * 2) / b).toInt(), lightGray),
//                Triple(((w - b * 1) / b).toInt(), ((h - b * 3) / b).toInt(), lightGray)
//            )
//
//            cornerPixels.forEach { (x, y, color) -> drawPixel(x, y, color) }
//
//            // Optional: draw side bars to enhance frame (top, bottom, left, right)
//            for (i in 3 until (w / b).toInt() - 3) {
//                drawPixel(i, 0, darkGray)
//                drawPixel(i, ((h / b).toInt() - 1), darkGray)
//            }
//            for (j in 3 until (h / b).toInt() - 3) {
//                drawPixel(0, j, darkGray)
//                drawPixel(((w / b).toInt() - 1), j, darkGray)
//            }
//        }
//
//        // Centered Text
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(32.dp),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = "MINECRAFT",
//                fontSize = 22.sp,
//                color = Color.Black,
//                fontFamily = FontFamily.Monospace,
//                fontWeight = FontWeight.Black
//            )
//        }
//    }
//}


////More close ----------------------------------------------- to actual result
//@Composable
//fun MinecraftPixelCard(
//    modifier: Modifier = Modifier,
//    content: @Composable () -> Unit
//) {
//    val blockSize = 6.dp
//    val cardWidth = 250.dp
//    val cardHeight = 200.dp
//
//    val darkGray = Color(0xFF2E2E2E)
//    val midGray = Color(0xFF4D4D4D)
//    val lightGray = Color(0xFF7A7A7A)
//    val bgColor = Color(0xFFF3EBDD)
//    val shadowGray = Color(0xFFAAA69D)
//
//    val grayVariants = listOf(darkGray, midGray, lightGray)
//
//    Box(
//        modifier = modifier
//            .size(cardWidth, cardHeight)
//            .background(bgColor)
//    ) {
//        Canvas(modifier = Modifier.fillMaxSize()) {
//            val b = blockSize.toPx()
//            val w = size.width
//            val h = size.height
//
//            fun drawPixel(x: Int, y: Int, color: Color) {
//                drawRect(
//                    color = color,
//                    topLeft = Offset(x * b, y * b),
//                    size = Size(b, b)
//                )
//            }
//
//            // Layer 1: Shadow border (outside)
//            for (i in 1 until (w / b).toInt() - 1) {
//                drawPixel(i, ((h / b).toInt()), shadowGray)
//            }
//            for (j in 1 until (h / b).toInt() - 1) {
//                drawPixel(((w / b).toInt()), j, shadowGray)
//            }
//
//            // Layer 2: Outer dark border
//            for (i in 1 until (w / b).toInt() - 1) {
//                drawPixel(i, 1, darkGray)
//                drawPixel(i, ((h / b).toInt() - 2), darkGray)
//            }
//            for (j in 1 until (h / b).toInt() - 1) {
//                drawPixel(1, j, darkGray)
//                drawPixel(((w / b).toInt() - 2), j, darkGray)
//            }
//
//            // Layer 3: Inner border (random gray tone)
//            for (i in 2 until (w / b).toInt() - 2) {
//                drawPixel(i, 2, grayVariants.random())
//                drawPixel(i, ((h / b).toInt() - 3), grayVariants.random())
//            }
//            for (j in 2 until (h / b).toInt() - 2) {
//                drawPixel(2, j, grayVariants.random())
//                drawPixel(((w / b).toInt() - 3), j, grayVariants.random())
//            }
//
//            // Pixelated Rounded Corners
//            val steps = listOf(
//                Triple(0, 0, darkGray), Triple(1, 0, midGray), Triple(2, 0, lightGray),
//                Triple(0, 1, midGray), Triple(1, 1, lightGray), Triple(0, 2, lightGray),
//
//                Triple(((w / b).toInt() - 1), 0, darkGray),
//                Triple(((w / b).toInt() - 2), 0, midGray),
//                Triple(((w / b).toInt() - 3), 0, lightGray),
//                Triple(((w / b).toInt() - 1), 1, midGray),
//                Triple(((w / b).toInt() - 2), 1, lightGray),
//                Triple(((w / b).toInt() - 1), 2, lightGray),
//
//                Triple(0, ((h / b).toInt() - 1), darkGray),
//                Triple(1, ((h / b).toInt() - 1), midGray),
//                Triple(2, ((h / b).toInt() - 1), lightGray),
//                Triple(0, ((h / b).toInt() - 2), midGray),
//                Triple(1, ((h / b).toInt() - 2), lightGray),
//                Triple(0, ((h / b).toInt() - 3), lightGray),
//
//                Triple(((w / b).toInt() - 1), ((h / b).toInt() - 1), darkGray),
//                Triple(((w / b).toInt() - 2), ((h / b).toInt() - 1), midGray),
//                Triple(((w / b).toInt() - 3), ((h / b).toInt() - 1), lightGray),
//                Triple(((w / b).toInt() - 1), ((h / b).toInt() - 2), midGray),
//                Triple(((w / b).toInt() - 2), ((h / b).toInt() - 2), lightGray),
//                Triple(((w / b).toInt() - 1), ((h / b).toInt() - 3), lightGray)
//            )
//            steps.forEach { (x, y, color) -> drawPixel(x, y, color) }
//        }
//
//        // Center Content (text or custom)
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(24.dp),
//            contentAlignment = Alignment.Center
//        ) {
//            content()
//        }
//    }
//}

///======USe
//MinecraftPixelCard {
//    Text(
//        "MINECRAFT",
//        fontSize = 22.sp,
//        fontFamily = FontFamily.Monospace,
//        fontWeight = FontWeight.ExtraBold,
//        color = Color.Black
//    )
//}
