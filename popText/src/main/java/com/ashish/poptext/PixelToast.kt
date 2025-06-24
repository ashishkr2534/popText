package com.ashish.poptext

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

/**
 * Created by Ashish Kr on 24,June,2025
 */
//@Composable
//fun PixelToast(
//    message: String,
//    show: Boolean,
//    modifier: Modifier = Modifier,
//    duration: Long = 2000L,
//    onDismiss: () -> Unit
//) {
//    if (show) {
//        LaunchedEffect(Unit) {
//            delay(duration)
//            onDismiss()
//        }
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
////                .fillMaxHeight()
//                .padding(16.dp),
//            contentAlignment = Alignment.BottomCenter
//        ) {
//            Surface(
//                color = Color.Black.copy(alpha = 0.85f),
//                shape = RoundedCornerShape(8.dp),
//                shadowElevation = 4.dp,
//                modifier = modifier
//            ) {
//                Text(
//                    text = message,
//                    color = Color.White,
//                    fontFamily = PixelFamilyBold,
//                    fontSize = 14.sp,
//                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
//                )
//            }
//        }
//    }
//}

@Composable
fun PixelToast(
    message: String,
    show: Boolean,
    modifier: Modifier = Modifier,
    duration: Long = 2000L,
    onDismiss: () -> Unit
) {
    if (show) {
        LaunchedEffect(Unit) {
            delay(duration)
            onDismiss()
        }

        Box(
            modifier = Modifier
                .fillMaxSize() // full screen so toast appears at bottom
                .padding(bottom = 60.dp, start = 16.dp, end = 16.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Surface(
                color = Color.Black.copy(alpha = 0.85f),
                shape = RoundedCornerShape(8.dp),
                shadowElevation = 4.dp,
                modifier = modifier
            ) {
                Text(
                    text = message,
                    color = Color.White,
                    fontFamily = PixelFamilyBold,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}


//var showToast by remember { mutableStateOf(false) }
//
//Column {
//    PixelButton("Show Toast", onClick = { showToast = true }, modifier = Modifier.fillMaxWidth())
//    PixelToast(message = "Hello from PixelToast!", show = showToast) {
//        showToast = false
//    }
//}

