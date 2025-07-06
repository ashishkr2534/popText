package com.ashish.poptext

import android.R.attr.layout
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.ceil

/**
 * Created by Ashish Kr on 24,June,2025
 */
@Composable
fun PixelCard(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFF1C1C1C),
    borderColor: Color = Color.White,
    contentColor: Color = Color.White,
    cornerRadius: Dp = 8.dp,
    borderWidth: Dp = 2.dp,
    elevation: Dp = 4.dp,
    title: String? = null,
    titleColor: Color = Color.Cyan,
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier
            .border(borderWidth, borderColor, RoundedCornerShape(cornerRadius)),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor,
            contentColor = contentColor
        ),
        shape = RoundedCornerShape(cornerRadius),
        elevation = CardDefaults.cardElevation(elevation)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            title?.let {
                Text(
                    text = it,
                    fontFamily = PixelFamilyBold,
                    color = titleColor,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
            content()
        }
    }
}

//@Composable
//fun PixelCard(
//    modifier: Modifier = Modifier,
//    backgroundColor: Color = Color(0xFF1C1C1C),
//    borderColor: Color = Color.White,
//    pixelSize: Dp = 4.dp,
//    contentPadding: Dp = 12.dp,
//    title: String? = null,
//    titleColor: Color = Color.Cyan,
//    contentColor: Color = Color.White,
//    content: @Composable () -> Unit
//) {
//    Box(modifier = modifier) {
//        // Background with pixel border using Canvas
//        Canvas(modifier = Modifier.matchParentSize()) {
//            val px = pixelSize.toPx()
//
//            // Draw top border
//            for (x in 0..(size.width / px).toInt()) {
//                drawRect(
//                    color = borderColor,
//                    topLeft = Offset(x * px, 0f),
//                    size = Size(px, px)
//                )
//            }
//
//            // Draw bottom border
//            for (x in 0..(size.width / px).toInt()) {
//                drawRect(
//                    color = borderColor,
//                    topLeft = Offset(x * px, size.height - px),
//                    size = Size(px, px)
//                )
//            }
//
//            // Draw left border
//            for (y in 1..(size.height / px - 2).toInt()) {
//                drawRect(
//                    color = borderColor,
//                    topLeft = Offset(0f, y * px),
//                    size = Size(px, px)
//                )
//            }
//
//            // Draw right border
//            for (y in 1..(size.height / px - 2).toInt()) {
//                drawRect(
//                    color = borderColor,
//                    topLeft = Offset(size.width - px, y * px),
//                    size = Size(px, px)
//                )
//            }
//        }
//
//        // Inner content box with padding
//        Column(
//            modifier = Modifier
//                .padding(all = pixelSize)
//                .background(color = backgroundColor)
//                .padding(contentPadding)
//        ) {
//            title?.let {
//                Text(
//                    text = it,
//                    fontFamily = PixelFamilyBold,
//                    color = titleColor,
//                    fontSize = 18.sp,
//                    modifier = Modifier.padding(bottom = 8.dp)
//                )
//            }
//
//            CompositionLocalProvider(LocalContentColor provides contentColor) {
//                content()
//            }
//        }
//    }
//}
//
//fun Modifier.pixelatedBorder(
//    borderColor: Color = Color.White,
//    borderWidth: Dp = 4.dp,
//    pixelSize: Dp = 4.dp
//): Modifier = this.drawBehind {
//    val stroke = borderWidth.toPx()
//    val pixel = pixelSize.toPx()
//    val width = size.width
//    val height = size.height
//
//    // Top border
//    var x = 0f
//    while (x < width) {
//        if ((x / pixel) % 2 == 0f) {
//            drawRect(
//                color = borderColor,
//                topLeft = Offset(x, 0f),
//                size = Size(pixel, stroke)
//            )
//        }
//
//        x += pixel
//    }
//
//    // Bottom border
//    x = 0f
//    while (x < width) {
//        if ((x / pixel) % 2 == 1f) {
//            drawRect(
//                color = borderColor,
//                topLeft = Offset(x, height - stroke),
//                size = Size(pixel, stroke)
//            )
//        }
//        x += pixel
//    }
//
//    // Left border
//    var y = 0f
//    while (y < height) {
//        if ((y / pixel) % 2 == 1f) {
//            drawRect(
//                color = borderColor,
//                topLeft = Offset(0f, y),
//                size = Size(stroke, pixel)
//            )
//        }
//        y += pixel
//    }
//
//    // Right border
//    y = 0f
//    while (y < height) {
//        if ((y / pixel) % 2 == 0f) {
//            drawRect(
//                color = borderColor,
//                topLeft = Offset(width - stroke, y),
//                size = Size(stroke, pixel)
//            )
//        }
//        y += pixel
//    }
//}

//@Composable
//fun PixelatedCard(
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
//
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
//            val xMax = (w / b).toInt()
//            val yMax = (h / b).toInt()
//
//            // Layer 1: Shadow border (outside)
//            for (i in 1 until xMax - 1) drawPixel(i, yMax, shadowGray)
//            for (j in 1 until yMax - 1) drawPixel(xMax, j, shadowGray)
//
//            // Layer 2: Outer dark border (excluding the 4 corners)
//            for (i in 1 until xMax - 1) {
//                if (i != 1 && i != xMax - 2) drawPixel(i, 1, darkGray) // skip (1,1) and (xMax-2,1)
//                if (i != 1 && i != xMax - 2) drawPixel(i, yMax - 2, darkGray) // skip (1,yMax-2) and (xMax-2,yMax-2)
//            }
//
//            for (j in 1 until yMax - 1) {
//                if (j != 1 && j != yMax - 2) drawPixel(1, j, darkGray) // skip (1,1) and (1,yMax-2)
//                if (j != 1 && j != yMax - 2) drawPixel(xMax - 2, j, darkGray) // skip (xMax-2,1) and (xMax-2,yMax-2)
//            }
//
//            // Layer 3: Inner border (random gray tone)
//            for (i in 2 until xMax - 2) {
//                drawPixel(i, 2, grayVariants.random())
//                drawPixel(i, yMax - 3, grayVariants.random())
//            }
//            for (j in 2 until yMax - 2) {
//                drawPixel(2, j, grayVariants.random())
//                drawPixel(xMax - 3, j, grayVariants.random())
//            }
//
//            // Pixelated Rounded Corners (excluding green)
//            val steps = listOf(
//                // Top-left
//                Triple(0, 0, Color.Green), Triple(1, 0, Color.Green), Triple(2, 0, Color.Green),
//                Triple(0, 1, Color.Green), Triple(1, 1, Color.Green), Triple(0, 2, Color.Green),
//
//                // Top-right
//                Triple(xMax - 1, 0, Color.Green), Triple(xMax - 2, 0, Color.Green), Triple(xMax - 3, 0, Color.Green),
//                Triple(xMax - 1, 1, Color.Green), Triple(xMax - 2, 1, Color.Green), Triple(xMax - 1, 2, Color.Green),
//
//                // Bottom-left
//                Triple(0, yMax - 1, Color.Green), Triple(1, yMax - 1, Color.Green), Triple(2, yMax - 1, Color.Green),
//                Triple(0, yMax - 2, Color.Green), Triple(1, yMax - 2, Color.Green), Triple(0, yMax - 3, Color.Green),
//
//                // Bottom-right
//                Triple(xMax - 1, yMax - 1, Color.Green), Triple(xMax - 2, yMax - 1, Color.Green), Triple(xMax - 3, yMax - 1, Color.Green),
//                Triple(xMax - 1, yMax - 2, Color.Green), Triple(xMax - 2, yMax - 2, Color.Green), Triple(xMax - 1, yMax - 3, Color.Green)
//            )
//
//            steps.filter { it.third != Color.Green }
//                .forEach { (x, y, color) -> drawPixel(x, y, color) }
//        }
//
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

//@Composable
//fun PixelatedCard(
//    modifier: Modifier = Modifier,
//    content: @Composable () -> Unit
//) {
//    val blockSize = 6.dp
//
//    val darkGray = Color(0xFF2E2E2E)
//    val midGray = Color(0xFF4D4D4D)
//    val lightGray = Color(0xFF7A7A7A)
//    val bgColor = Color(0xFFF3EBDD)
//    val shadowGray = Color(0xFFAAA69D)
//
//    val grayVariants = listOf(darkGray, midGray, lightGray)
//
//    // Fixed grid size (you can make it dynamic if needed)
//    val xBlocks = 44
//    val yBlocks = 36
//
////    val canvasWidth = blockSize * xBlocks
////    val canvasHeight = blockSize * yBlocks
//
//    Box(
//        modifier = modifier
////            .size(canvasWidth, canvasHeight)
////            .background(bgColor)
//    ) {
//        Canvas(modifier = Modifier
////            .size(canvasWidth, canvasHeight)
//        ) {
//            val b = blockSize.toPx()
//
//            fun drawPixel(x: Int, y: Int, color: Color) {
//                drawRect(
//                    color = color,
//                    topLeft = Offset(x * b, y * b),
//                    size = Size(b, b)
//                )
//            }
//
//            val xMax = xBlocks
//            val yMax = yBlocks
//
//            // Layer 1: Shadow border
//            for (i in 1 until xMax - 1) drawPixel(i, yMax, shadowGray)
//            for (j in 1 until yMax - 1) drawPixel(xMax, j, shadowGray)
//
//            // Layer 2: Outer dark border (excluding the corners)
//            for (i in 1 until xMax - 1) {
//                if (i != 1 && i != xMax - 2) drawPixel(i, 1, darkGray)
//                if (i != 1 && i != xMax - 2) drawPixel(i, yMax - 2, darkGray)
//            }
//            for (j in 1 until yMax - 1) {
//                if (j != 1 && j != yMax - 2) drawPixel(1, j, darkGray)
//                if (j != 1 && j != yMax - 2) drawPixel(xMax - 2, j, darkGray)
//            }
//
//            // Layer 3: Inner border
//            for (i in 2 until xMax - 2) {
//                drawPixel(i, 2, grayVariants.random())
//                drawPixel(i, yMax - 3, grayVariants.random())
//            }
//            for (j in 2 until yMax - 2) {
//                drawPixel(2, j, grayVariants.random())
//                drawPixel(xMax - 3, j, grayVariants.random())
//            }
//
//            // Skip Green pixels (rounded corners)
//            val steps = listOf(
//                Triple(0, 0, Color.Green), Triple(1, 0, Color.Green), Triple(2, 0, Color.Green),
//                Triple(0, 1, Color.Green), Triple(1, 1, Color.Green), Triple(0, 2, Color.Green),
//                Triple(xMax - 1, 0, Color.Green), Triple(xMax - 2, 0, Color.Green), Triple(xMax - 3, 0, Color.Green),
//                Triple(xMax - 1, 1, Color.Green), Triple(xMax - 2, 1, Color.Green), Triple(xMax - 1, 2, Color.Green),
//                Triple(0, yMax - 1, Color.Green), Triple(1, yMax - 1, Color.Green), Triple(2, yMax - 1, Color.Green),
//                Triple(0, yMax - 2, Color.Green), Triple(1, yMax - 2, Color.Green), Triple(0, yMax - 3, Color.Green),
//                Triple(xMax - 1, yMax - 1, Color.Green), Triple(xMax - 2, yMax - 1, Color.Green), Triple(xMax - 3, yMax - 1, Color.Green),
//                Triple(xMax - 1, yMax - 2, Color.Green), Triple(xMax - 2, yMax - 2, Color.Green), Triple(xMax - 1, yMax - 3, Color.Green)
//            )
//
//            steps.filter { it.third != Color.Green }
//                .forEach { (x, y, color) -> drawPixel(x, y, color) }
//        }
//
//        Column(
//            modifier = Modifier
////                .fillMaxWidth(0.8f)
////                .fillMaxSize()
//                .padding(24.dp),
////            contentAlignment = Alignment.Center
//        ) {
//            content()
//        }
//    }
//}

@Composable
fun MinecraftPixelCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val blockSize = 6.dp

    val darkGray = Color(0xFF2E2E2E)
    val midGray = Color(0xFF4D4D4D)
    val lightGray = Color(0xFF7A7A7A)
    val bgColor = Color(0xFFF3EBDD)
    val shadowGray = Color(0xFFAAA69D)
    val grayVariants = listOf(darkGray, midGray, lightGray)

    // Apply default fillMaxWidth unless user provides their own width
    val finalModifier = Modifier
        .fillMaxWidth()
        .then(modifier) // user modifier overrides default

    Box(
        modifier = finalModifier
            .wrapContentHeight()
            .background(bgColor)
    ) {
        Box(
            modifier = Modifier.matchParentSize()
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val b = blockSize.toPx()
                val w = size.width
                val h = size.height

                fun drawPixel(x: Int, y: Int, color: Color) {
                    drawRect(
                        color = color,
                        topLeft = Offset(x * b, y * b),
                        size = Size(b, b)
                    )
                }

                val xMax = (w / b).toInt()
                val yMax = (h / b).toInt()

                for (i in 1 until xMax - 1) drawPixel(i, yMax, shadowGray)
                for (j in 1 until yMax - 1) drawPixel(xMax, j, shadowGray)

                for (i in 1 until xMax - 1) {
                    if (i != 1 && i != xMax - 2) drawPixel(i, 1, darkGray)
                    if (i != 1 && i != xMax - 2) drawPixel(i, yMax - 2, darkGray)
                }

                for (j in 1 until yMax - 1) {
                    if (j != 1 && j != yMax - 2) drawPixel(1, j, darkGray)
                    if (j != 1 && j != yMax - 2) drawPixel(xMax - 2, j, darkGray)
                }

                for (i in 2 until xMax - 2) {
                    drawPixel(i, 2, grayVariants.random())
                    drawPixel(i, yMax - 3, grayVariants.random())
                }
                for (j in 2 until yMax - 2) {
                    drawPixel(2, j, grayVariants.random())
                    drawPixel(xMax - 3, j, grayVariants.random())
                }

                val steps = listOf(
                    Triple(0, 0, Color.Green), Triple(1, 0, Color.Green), Triple(2, 0, Color.Green),
                    Triple(0, 1, Color.Green), Triple(1, 1, Color.Green), Triple(0, 2, Color.Green),

                    Triple(xMax - 1, 0, Color.Green), Triple(xMax - 2, 0, Color.Green), Triple(xMax - 3, 0, Color.Green),
                    Triple(xMax - 1, 1, Color.Green), Triple(xMax - 2, 1, Color.Green), Triple(xMax - 1, 2, Color.Green),

                    Triple(0, yMax - 1, Color.Green), Triple(1, yMax - 1, Color.Green), Triple(2, yMax - 1, Color.Green),
                    Triple(0, yMax - 2, Color.Green), Triple(1, yMax - 2, Color.Green), Triple(0, yMax - 3, Color.Green),

                    Triple(xMax - 1, yMax - 1, Color.Green), Triple(xMax - 2, yMax - 1, Color.Green), Triple(xMax - 3, yMax - 1, Color.Green),
                    Triple(xMax - 1, yMax - 2, Color.Green), Triple(xMax - 2, yMax - 2, Color.Green), Triple(xMax - 1, yMax - 3, Color.Green)
                )

                steps.filter { it.third != Color.Green }
                    .forEach { (x, y, color) -> drawPixel(x, y, color) }
            }
        }

        Box(
            modifier = Modifier
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            content()
        }
    }
}



