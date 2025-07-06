package com.ashish.poptext

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

/**
 * Created by Ashish Kr on 24,June,2025
 */
//@Composable
//fun PixelAlertDialog(
//    modifier: Modifier = Modifier,
//    onDismissRequest: () -> Unit,
//    title: String,
//    message: String,
//    confirmText: String = "OK",
//    onConfirm: () -> Unit
//) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black.copy(alpha = 0.6f))
//            .clickable(
//                indication = null,
//                interactionSource = remember { MutableInteractionSource() }
//            ) { onDismissRequest() },
//        contentAlignment = Alignment.Center
//    ) {
//        Canvas(modifier = modifier.size(280.dp, 180.dp)) {
//            val pixel = 8.dp.toPx()
//            val w = size.width
//            val h = size.height
//
//            // Body Rectangle
//            drawRect(
//                color = Color.White,
//                topLeft = Offset(pixel * 2, pixel * 2),
//                size = Size(w - pixel * 4, h - pixel * 4)
//            )
//
//            // Pixel Border
//            for (x in 0 until (w / pixel).toInt()) {
//                if (x % 2 == 0) {
//                    drawRect(Color.Black, Offset(x * pixel, pixel), Size(pixel, pixel)) // Top
//                    drawRect(Color.Black, Offset(x * pixel, h - pixel * 2), Size(pixel, pixel)) // Bottom
//                }
//            }
//            for (y in 1 until (h / pixel).toInt() - 1) {
//                if (y % 2 == 1) {
//                    drawRect(Color.Black, Offset(pixel, y * pixel), Size(pixel, pixel)) // Left
//                    drawRect(Color.Black, Offset(w - pixel * 2, y * pixel), Size(pixel, pixel)) // Right
//                }
//            }
//
//            // Pixel Tail (speech bubble)
//            drawRect(Color.Black, Offset(pixel * 3, h - pixel * 1), Size(pixel, pixel))
//            drawRect(Color.Black, Offset(pixel * 2, h), Size(pixel, pixel))
//            drawRect(Color.Black, Offset(pixel * 4, h), Size(pixel, pixel))
//        }
//
//        // Foreground content inside dialog
//        Column(
//            modifier = Modifier
//                .size(280.dp, 180.dp)
//                .padding(24.dp),
//            verticalArrangement = Arrangement.SpaceBetween
//        ) {
//            Column {
//                Text(
//                    text = title,
//                    style = TextStyle(
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        fontFamily = FontFamily.Monospace,
//                        color = Color.Black
//                    )
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//                Text(
//                    text = message,
//                    style = TextStyle(
//                        fontSize = 16.sp,
//                        fontFamily = FontFamily.Monospace,
//                        color = Color.Black
//                    )
//                )
//            }
//
//            Button(
//                onClick = onConfirm,
//                modifier = Modifier
//                    .align(Alignment.End)
//                    .pixelatedBorder(Color.Black, 2.dp, 4.dp), // Your custom border
//                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
//            ) {
//                Text(confirmText, color = Color.Black)
//            }
//        }
//    }
//}

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

@Composable
fun PixelAlertDialog(
    onDismissRequest: () -> Unit,
    title: String,
    text: String,
    confirmButtonText: String,
    onConfirm: () -> Unit,
    dismissButtonText: String? = null,
    onDismiss: (() -> Unit)? = null,
    modifier: Modifier = Modifier,
    properties: DialogProperties = DialogProperties()
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        MinecraftPixelCard(
            modifier = modifier
                .padding(5.dp)
                .wrapContentHeight()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    color = Color(0xFF2E2E2E),
                    modifier = Modifier.padding(bottom = 12.dp)
                )

                Text(
                    text = text,
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Monospace,
                    color = Color(0xFF2E2E2E),
                    modifier = Modifier.padding(bottom = 24.dp)
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.align(Alignment.End)
                ) {
                    dismissButtonText?.let {
                        Button(
                            onClick = {
                                onDismiss?.invoke() ?: onDismissRequest()
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFAAAAAA),
                                contentColor = Color.Black
                            )
                        ) {
                            Text(it, fontFamily = FontFamily.Monospace)
                        }
                    }

                    Button(
                        onClick = onConfirm,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF6BBF59),
                            contentColor = Color.White
                        )
                    ) {
                        Text(confirmButtonText, fontFamily = FontFamily.Monospace)
                    }

                }
            }
        }
    }
}

@Composable
fun PixelAlertDialogCustom(
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    title: (@Composable () -> Unit)? = null,
    text: (@Composable () -> Unit)? = null,
    confirmButton: @Composable () -> Unit,
    dismissButton: (@Composable () -> Unit)? = null,
    properties: DialogProperties = DialogProperties()
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        MinecraftPixelCard(
            modifier = modifier
                .padding(5.dp)
                .wrapContentHeight()
        ) {
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
            ) {
                title?.let {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 12.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        it()
                    }
                }

                text?.let {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 24.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        it()
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier
                        .align(Alignment.End)
                ) {
                    dismissButton?.invoke()
                    confirmButton()
                }
            }
        }
    }
}




