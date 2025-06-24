package com.ashish.poptext.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashish.poptext.PixelCard

/**
 * Created by Ashish Kr on 24,June,2025
 */
@Composable
fun PixelMCard(
    modifier: Modifier = Modifier,
    text: String = "MINECRAFT"
) {
    Box(
        modifier = modifier
            .background(Color(0xFFF4EFD9)) // Background color similar to the image
            .padding(32.dp),
        contentAlignment = Alignment.Center
    ) {
        // Outer pixel border layer
        Canvas(modifier = Modifier.size(200.dp)) {
            val blockSize = 8.dp.toPx()
            val borderColorDark = Color(0xFF2D2D2D)
            val borderColorLight = Color(0xFFB0B0B0)

            // Draw left and top dark edge
            for (i in 0..22) {
                drawRect(borderColorDark, Offset(0f, i * blockSize), Size(blockSize, blockSize)) // left
                drawRect(borderColorDark, Offset(i * blockSize, 0f), Size(blockSize, blockSize)) // top
            }

            // Draw right and bottom light edge
            for (i in 0..22) {
                drawRect(borderColorLight, Offset(size.width - blockSize, i * blockSize), Size(blockSize, blockSize)) // right
                drawRect(borderColorLight, Offset(i * blockSize, size.height - blockSize), Size(blockSize, blockSize)) // bottom
            }
        }

        // Text on top of pixel card
        Text(
            text = text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            color = Color(0xFF2D2D2D),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        )
    }
}

@Preview
@Composable

fun PreviewPixelCard() {
//    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFFF4EFD9)) {
//        PixelMCard()
//        MinecraftCard()
//        MinecraftStyledCard()
        MinecraftPixelCard2(content = {
            Text(text = "MINECRAFT",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                color = Color(0xFF2D2D2D),
        )})
//    }
}

@Composable
fun MinecraftCard(modifier: Modifier = Modifier) {
    Box(
        modifier
            .padding(16.dp)
            .background(Color(0xFFFAF1E4)) // Match background from image
            .wrapContentSize()
    ) {
        // Outer pixelated border using Canvas
        Canvas(modifier = Modifier.size(200.dp)) {
            val borderWidth = 8.dp.toPx()

            // Pixel-style border rectangles
            drawRect(color = Color.DarkGray, size = size)

            drawRect(
                color = Color.LightGray,
                topLeft = Offset(borderWidth, borderWidth),
                size = Size(size.width - 2 * borderWidth, size.height - 2 * borderWidth)
            )
        }

        // Inner content
        Box(
            modifier = Modifier
                .padding(24.dp)
                .align(Alignment.Center)
        ) {
            Text(
                text = "MINECRAFT",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}

@Composable
fun MinecraftStyledCard() {
    val blockSize = 8.dp // Size of each "pixel" block

    Box(
        modifier = Modifier
            .padding(32.dp)
            .background(Color(0xFFFAF1E4)) // Match the outer background
    ) {
        // Outer layer
        Box(
            modifier = Modifier
//                .size(200.dp)
                .shadow(0.dp, RoundedCornerShape(20.dp))

                .background(Color.Transparent)
        ) {
            Canvas(modifier = Modifier) {
                val block = blockSize.toPx()
                val width = size.width
                val height = size.height

                // Colors for the border blocks
                val borderColors = listOf(
                    Color(0xFF222222),
                    Color(0xFF444444),
                    Color(0xFF666666),
                    Color(0xFF888888)
                )

                // Top-left corner blocks (layered)
                for (i in borderColors.indices) {
                    drawRect(
                        color = borderColors[i],
                        topLeft = Offset(i * block, i * block),
                        size = Size(width - 2 * i * block, height - 2 * i * block),
                        style = Stroke(width = block)
                    )
                }
            }

            // Center text
            Box(
                modifier = Modifier
//                    .fillMaxSize()
                    .shadow(0.dp, RoundedCornerShape(20.dp))
                    .padding(24.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "MINECRAFT",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace, // Replace with Minecraft font if needed
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

//@Composable
//fun MinecraftPixelCard(modifier: Modifier = Modifier,
//                       content: @Composable () -> Unit ) {
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
//                .fillMaxSize(),
////                .padding(32.dp),
//            contentAlignment = Alignment.Center
//        ) {
////            Text(
////                text = "MINECRAFT",
////                fontSize = 22.sp,
////                color = Color.Black,
////                fontFamily = FontFamily.Monospace,
////                fontWeight = FontWeight.Black
////            )
//            content
//        }
//    }
//}

@Composable
fun MinecraftPixelCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val blockSize = 6.dp
    val cardWidth = 250.dp
    val cardHeight = 200.dp

    val darkGray = Color(0xFF2E2E2E)
    val midGray = Color(0xFF4D4D4D)
    val lightGray = Color(0xFF7A7A7A)
    val bgColor = Color(0xFFF3EBDD)
    val shadowGray = Color(0xFFAAA69D)

    val grayVariants = listOf(darkGray, midGray, lightGray)

    Box(
        modifier = modifier
            .size(cardWidth, cardHeight)
            .background(bgColor)
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

            // Layer 1: Shadow border (outside)
            for (i in 1 until (w / b).toInt() - 1) {
                drawPixel(i, ((h / b).toInt()), shadowGray)
            }
            for (j in 1 until (h / b).toInt() - 1) {
                drawPixel(((w / b).toInt()), j, shadowGray)
            }

            // Layer 2: Outer dark border
            for (i in 1 until (w / b).toInt() - 1) {
                drawPixel(i, 1, darkGray)
                drawPixel(i, ((h / b).toInt() - 2), darkGray)
            }
            for (j in 1 until (h / b).toInt() - 1) {
                drawPixel(1, j, darkGray)
                drawPixel(((w / b).toInt() - 2), j, darkGray)
            }

            // Layer 3: Inner border (random gray tone)
            for (i in 2 until (w / b).toInt() - 2) {
                drawPixel(i, 2, grayVariants.random())
                drawPixel(i, ((h / b).toInt() - 3), grayVariants.random())
            }
            for (j in 2 until (h / b).toInt() - 2) {
                drawPixel(2, j, grayVariants.random())
                drawPixel(((w / b).toInt() - 3), j, grayVariants.random())
            }

            // Pixelated Rounded Corners
            val steps = listOf(
                Triple(0, 0, Color.Green), Triple(1, 0, Color.Green), Triple(2, 0, Color.Green),
                Triple(0, 1, Color.Green), Triple(1, 1, Color.Green), Triple(0, 2, Color.Green),

                Triple(((w / b).toInt() - 1), 0, Color.Green),
                Triple(((w / b).toInt() - 2), 0, Color.Green),
                Triple(((w / b).toInt() - 3), 0, Color.Green),
                Triple(((w / b).toInt() - 1), 1, Color.Green),
                Triple(((w / b).toInt() - 2), 1, Color.Green),
                Triple(((w / b).toInt() - 1), 2, Color.Green),

                Triple(0, ((h / b).toInt() - 1), Color.Green),
                Triple(1, ((h / b).toInt() - 1), Color.Green),
                Triple(2, ((h / b).toInt() - 1), Color.Green),
                Triple(0, ((h / b).toInt() - 2), Color.Green),
                Triple(1, ((h / b).toInt() - 2), Color.Green),
                Triple(0, ((h / b).toInt() - 3), Color.Green),

                Triple(((w / b).toInt() - 1), ((h / b).toInt() - 1), Color.Green),
                Triple(((w / b).toInt() - 2), ((h / b).toInt() - 1), Color.Green),
                Triple(((w / b).toInt() - 3), ((h / b).toInt() - 1), Color.Green),
                Triple(((w / b).toInt() - 1), ((h / b).toInt() - 2), Color.Green),
                Triple(((w / b).toInt() - 2), ((h / b).toInt() - 2), Color.Green),
                Triple(((w / b).toInt() - 1), ((h / b).toInt() - 3), Color.Green)
            )
            steps.forEach { (x, y, color) -> drawPixel(x, y, color) }
        }

        // Center Content (text or custom)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            content()
        }
    }
}

// Pixelated Rounded Corners (3 pixels per corner)
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
//            val xMax = (w / b).toInt()
//            val yMax = (h / b).toInt()
//
////            // Layer 1: Shadow border
////            for (i in 1 until xMax - 1) drawPixel(i, yMax, shadowGray)
////            for (j in 1 until yMax - 1) drawPixel(xMax, j, shadowGray)
//
//            // Layer 2: Outer dark border
//            for (i in 1 until xMax - 1) {
//                drawPixel(i, 1, darkGray)
//                drawPixel(i, yMax - 2, darkGray)
//                drawPixel(i, yMax - 3, darkGray)
//            }
//            for (j in 1 until yMax - 1) {
//                drawPixel(1, j, darkGray)
//                drawPixel(xMax - 2, j, darkGray)
//            }
//
//            // Layer 3: Inner border (random shades)
//            for (i in 2 until xMax - 2) {
//                drawPixel(i, 2, grayVariants.random())
//                drawPixel(i, yMax - 3, grayVariants.random())
//            }
//            for (j in 2 until yMax - 2) {
//                drawPixel(2, j, grayVariants.random())
//                drawPixel(xMax - 3, j, grayVariants.random())
//            }
//
//            // Layer 4: Inner border (random shades)
//            for (i in 3 until xMax - 2) {
//                drawPixel(i, 3, grayVariants.random())
//                drawPixel(i, yMax - 4, grayVariants.random())
//            }
//
//
//            // Layer 4: Inner border (random shades)
//            for (i in 4 until xMax - 2) {
//                drawPixel(i, 4, grayVariants.random())
//                drawPixel(i, yMax - 5, grayVariants.random())
//            }
////            for (j in 2 until yMax - 2) {
////                drawPixel(2, j, grayVariants.random())
////                drawPixel(xMax - 3, j, grayVariants.random())
////            }
//
//
//            // Pixelated 3-step rounded corners
//            val cornerSteps = listOf(
//                // Top Left
//                Triple(2, 0, lightGray),
//                Triple(1, 0, midGray),
//                Triple(0, 0, darkGray),
//                Triple(0, 1, midGray),
//                Triple(0, 2, lightGray),
//                Triple(1, 1, lightGray),
//
//                // Top Right
//                Triple(xMax - 3, 0, lightGray),
//                Triple(xMax - 2, 0, midGray),
//                Triple(xMax - 1, 0, darkGray),
//                Triple(xMax - 1, 1, midGray),
//                Triple(xMax - 1, 2, lightGray),
//                Triple(xMax - 2, 1, lightGray),
//
//                // Bottom Left
//                Triple(0, yMax - 1, Color.Green),
//                Triple(0, yMax - 2, midGray),
//                Triple(0, yMax - 3, lightGray),
//                Triple(1, yMax - 1, midGray),
//                Triple(2, yMax - 1, lightGray),
//                Triple(1, yMax - 2, lightGray),
//
//                // Bottom Right
//                Triple(xMax - 1, yMax - 1, darkGray),
//                Triple(xMax - 1, yMax - 2, midGray),
//                Triple(xMax - 1, yMax - 3, lightGray),
//                Triple(xMax - 2, yMax - 1, midGray),
//                Triple(xMax - 3, yMax - 1, lightGray),
//                Triple(xMax - 2, yMax - 2, lightGray)
//            )
////            cornerSteps.forEach { (x, y, color) -> drawPixel(x, y, color) }
//        }
//
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
//            val xMax = (w / b).toInt()
//            val yMax = (h / b).toInt()
//
//            // Layer 1: Outer dark border
//            for (i in 1 until xMax - 1) {
//                drawPixel(i, 1, darkGray)
//                drawPixel(i, yMax - 2, darkGray)
//                drawPixel(i, yMax - 3, darkGray) // optional extra row for depth
//            }
//            for (j in 1 until yMax - 1) {
//                drawPixel(1, j, darkGray)
//                drawPixel(xMax - 2, j, darkGray)
//            }
//
//            // Layer 2: Inner border (random shades)
//            for (i in 2 until xMax - 2) {
//                drawPixel(i, 2, grayVariants.random())
//                drawPixel(i, yMax - 3, grayVariants.random())
//            }
//            for (j in 2 until yMax - 2) {
//                drawPixel(2, j, grayVariants.random())
//                drawPixel(xMax - 3, j, grayVariants.random())
//            }
//
//            // Layer 3: More inner border (deeper)
//            for (i in 3 until xMax - 2) {
//                drawPixel(i, 3, grayVariants.random())
//                drawPixel(i, yMax - 4, grayVariants.random())
//            }
//
//            // Layer 4: Even deeper inner border
//            for (i in 4 until xMax - 2) {
//                drawPixel(i, 4, grayVariants.random())
//                drawPixel(i, yMax - 5, grayVariants.random())
//            }
//
//            // Pixelated 3-layer rounded corners
//            val cornerSteps = listOf(
//                // Top Left
//                Triple(2, 0, lightGray),
//                Triple(1, 0, midGray),
//                Triple(0, 0, darkGray),
//                Triple(0, 1, midGray),
//                Triple(0, 2, lightGray),
//                Triple(1, 1, lightGray),
//
//                // Top Right
//                Triple(xMax - 3, 0, lightGray),
//                Triple(xMax - 2, 0, midGray),
//                Triple(xMax - 1, 0, darkGray),
//                Triple(xMax - 1, 1, midGray),
//                Triple(xMax - 1, 2, lightGray),
//                Triple(xMax - 2, 1, lightGray),
//
//                // Bottom Left
//                Triple(0, yMax - 1, darkGray),
//                Triple(0, yMax - 2, midGray),
//                Triple(0, yMax - 3, lightGray),
//                Triple(1, yMax - 1, midGray),
//                Triple(2, yMax - 1, lightGray),
//                Triple(1, yMax - 2, lightGray),
//
//                // Bottom Right
////                Triple(xMax - 1, yMax - 1, darkGray),
////                Triple(xMax - 1, yMax - 2, midGray),
////                Triple(xMax - 1, yMax - 3, lightGray),
////                Triple(xMax - 2, yMax - 1, midGray),
////                Triple(xMax - 3, yMax - 1, lightGray),
//                Triple(xMax - 2, yMax - 2, lightGray)
//            )
//            cornerSteps.forEach { (x, y, color) -> drawPixel(x, y, color) }
//        }
//
//        Box(
//            modifier = Modifier
//                .fillMaxSize(),
////                .padding(24.dp),
//            contentAlignment = Alignment.Center
//        ) {
//            content()
//        }
//    }
//}

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
//            val xMax = (w / b).toInt()
//            val yMax = (h / b).toInt()
//
//            // Outer Dark Border
//            for (i in 0 until xMax) {
//                drawPixel(i, 0, darkGray)
//                drawPixel(i, yMax - 1, darkGray)
//            }
//            for (j in 0 until yMax) {
//                drawPixel(0, j, darkGray)
//                drawPixel(xMax - 1, j, darkGray)
//            }
//
//            // Inner Border with rounded corners excluded
//            val excludedCorners = setOf(
//                Pair(1, 1), Pair(1, 2), Pair(1, 3), Pair(2, 1), Pair(2, 2), Pair(3, 1), // Top Left
//                Pair(xMax - 2, 1), Pair(xMax - 2, 2), Pair(xMax - 2, 3), Pair(xMax - 3, 1), Pair(xMax - 3, 2), Pair(xMax - 4, 1), // Top Right
//                Pair(1, yMax - 2), Pair(1, yMax - 3), Pair(1, yMax - 4), Pair(2, yMax - 2), Pair(2, yMax - 3), Pair(3, yMax - 2), // Bottom Left
//                Pair(xMax - 2, yMax - 2), Pair(xMax - 2, yMax - 3), Pair(xMax - 2, yMax - 4), Pair(xMax - 3, yMax - 2), Pair(xMax - 3, yMax - 3), Pair(xMax - 4, yMax - 2) // Bottom Right
//            )
//
//            // Inner border - Gray variants
//            for (i in 1 until xMax - 1) {
//                if (!excludedCorners.contains(Pair(i, 1)))
//                    drawPixel(i, 1, grayVariants.random())
//                if (!excludedCorners.contains(Pair(i, yMax - 2)))
//                    drawPixel(i, yMax - 2, grayVariants.random())
//            }
//            for (i in 2 until xMax - 1) {
//                if (!excludedCorners.contains(Pair(i, 1)))
//                    drawPixel(i, 2, grayVariants.random())
//                if (!excludedCorners.contains(Pair(i, yMax - 2)))
//                    drawPixel(i, yMax - 2, grayVariants.random())
//            }
//            for (j in 1 until yMax - 1) {
//                if (!excludedCorners.contains(Pair(1, j)))
//                    drawPixel(1, j, grayVariants.random())
//                if (!excludedCorners.contains(Pair(xMax - 2, j)))
//                    drawPixel(xMax - 2, j, grayVariants.random())
//            }
//        }
//
//        // Center content
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
//
//
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
//    val shadowGray = Color(0xFFB8B3A8)
//    val bgColor = Color(0xFFF3EBDD)
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
//            val xMax = (w / b).toInt()
//            val yMax = (h / b).toInt()
//
//            fun drawPixel(x: Int, y: Int, color: Color) {
//                drawRect(
//                    color = color,
//                    topLeft = Offset(x * b, y * b),
//                    size = Size(b, b)
//                )
//            }
//
//            // === LAYER 1: Shadow (bottom and right)
//            for (i in 3 until xMax) drawPixel(i, yMax - 1, shadowGray)
//            for (j in 3 until yMax) drawPixel(xMax - 1, j, shadowGray)
//
//            // === LAYER 2: Outer black frame
//            for (i in 2 until xMax - 1) {
//                drawPixel(i, 2, darkGray)
//                drawPixel(i, yMax - 3, darkGray)
//            }
//            for (j in 2 until yMax - 1) {
//                drawPixel(2, j, darkGray)
//                drawPixel(xMax - 3, j, darkGray)
//            }
//
//            // === LAYER 3: Inner random gray border
//            for (i in 3 until xMax - 3) {
//                drawPixel(i, 3, grayVariants.random())
//                drawPixel(i, yMax - 4, grayVariants.random())
//            }
//            for (j in 3 until yMax - 3) {
//                drawPixel(3, j, grayVariants.random())
//                drawPixel(xMax - 4, j, grayVariants.random())
//            }
//
//            // === CORNERS (Pixelated rounding)
//            val cornerPixels = listOf(
//                // Top-left corner
//                Triple(0, 2, darkGray), Triple(1, 2, midGray), Triple(2, 0, darkGray),
//                Triple(0, 1, midGray), Triple(1, 1, lightGray), Triple(1, 0, lightGray),
//
//                // Top-right
//                Triple(xMax - 1, 2, darkGray), Triple(xMax - 2, 2, midGray), Triple(xMax - 3, 0, darkGray),
//                Triple(xMax - 1, 1, midGray), Triple(xMax - 2, 1, lightGray), Triple(xMax - 2, 0, lightGray),
//
//                // Bottom-left
//                Triple(0, yMax - 3, darkGray), Triple(1, yMax - 3, midGray), Triple(2, yMax - 1, darkGray),
//                Triple(0, yMax - 2, midGray), Triple(1, yMax - 2, lightGray), Triple(1, yMax - 1, lightGray),
//
//                // Bottom-right
//                Triple(xMax - 1, yMax - 3, darkGray), Triple(xMax - 2, yMax - 3, midGray), Triple(xMax - 3, yMax - 1, darkGray),
//                Triple(xMax - 1, yMax - 2, midGray), Triple(xMax - 2, yMax - 2, lightGray), Triple(xMax - 2, yMax - 1, lightGray)
//            )
//
//            cornerPixels.forEach { (x, y, color) -> drawPixel(x, y, color) }
//        }
//
//        // Content in center
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
//fun MinecraftPixelCard2(
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
////            .size(cardWidth, cardHeight)
//            .background(bgColor)
//    ) {
//
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
//            modifier = Modifier.fillMaxWidth()
////                .fillMaxSize()
//                .padding(24.dp),
//            contentAlignment = Alignment.Center
//        ) {
//            content()
//        }
//    }
//}

//@Composable
//fun MinecraftPixelCard2(
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
//    val grayVariants = listOf(darkGray, midGray, lightGray)
//
//    Box(
//        modifier = modifier
//            .wrapContentSize()
//            .background(bgColor)
//    ) {
//        Box(
//            modifier = Modifier
//                .matchParentSize() // makes the canvas match content area
//        ) {
//            Canvas(modifier = Modifier.fillMaxSize()) {
//                val b = blockSize.toPx()
//                val w = size.width
//                val h = size.height
//
//                fun drawPixel(x: Int, y: Int, color: Color) {
//                    drawRect(
//                        color = color,
//                        topLeft = Offset(x * b, y * b),
//                        size = Size(b, b)
//                    )
//                }
//
//                val xMax = (w / b).toInt()
//                val yMax = (h / b).toInt()
//
//                for (i in 1 until xMax - 1) drawPixel(i, yMax, shadowGray)
//                for (j in 1 until yMax - 1) drawPixel(xMax, j, shadowGray)
//
//                for (i in 1 until xMax - 1) {
//                    if (i != 1 && i != xMax - 2) drawPixel(i, 1, darkGray)
//                    if (i != 1 && i != xMax - 2) drawPixel(i, yMax - 2, darkGray)
//                }
//
//                for (j in 1 until yMax - 1) {
//                    if (j != 1 && j != yMax - 2) drawPixel(1, j, darkGray)
//                    if (j != 1 && j != yMax - 2) drawPixel(xMax - 2, j, darkGray)
//                }
//
//                for (i in 2 until xMax - 2) {
//                    drawPixel(i, 2, grayVariants.random())
//                    drawPixel(i, yMax - 3, grayVariants.random())
//                }
//                for (j in 2 until yMax - 2) {
//                    drawPixel(2, j, grayVariants.random())
//                    drawPixel(xMax - 3, j, grayVariants.random())
//                }
//
//                val steps = listOf(
//                    Triple(0, 0, Color.Green), Triple(1, 0, Color.Green), Triple(2, 0, Color.Green),
//                    Triple(0, 1, Color.Green), Triple(1, 1, Color.Green), Triple(0, 2, Color.Green),
//
//                    Triple(xMax - 1, 0, Color.Green), Triple(xMax - 2, 0, Color.Green), Triple(xMax - 3, 0, Color.Green),
//                    Triple(xMax - 1, 1, Color.Green), Triple(xMax - 2, 1, Color.Green), Triple(xMax - 1, 2, Color.Green),
//
//                    Triple(0, yMax - 1, Color.Green), Triple(1, yMax - 1, Color.Green), Triple(2, yMax - 1, Color.Green),
//                    Triple(0, yMax - 2, Color.Green), Triple(1, yMax - 2, Color.Green), Triple(0, yMax - 3, Color.Green),
//
//                    Triple(xMax - 1, yMax - 1, Color.Green), Triple(xMax - 2, yMax - 1, Color.Green), Triple(xMax - 3, yMax - 1, Color.Green),
//                    Triple(xMax - 1, yMax - 2, Color.Green), Triple(xMax - 2, yMax - 2, Color.Green), Triple(xMax - 1, yMax - 3, Color.Green)
//                )
//
//                steps.filter { it.third != Color.Green }
//                    .forEach { (x, y, color) -> drawPixel(x, y, color) }
//            }
//        }
//
//        Box(
//            modifier = Modifier
//                .padding(24.dp),
//            contentAlignment = Alignment.Center
//        ) {
//            content()
//        }
//    }
//}

@Composable
fun MinecraftPixelCard2(
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


