package com.ashish.poptext

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashish.poptext.ui.theme.MinecraftPixelCard2
import com.ashish.poptext.ui.theme.PopTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PopTextTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    val context = LocalContext.current
//    Column(modifier = Modifier.padding(20.dp)) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier,
//            color = Green
//        )
//        IconButton(onClick = { TODO() }) {
//            Icon(imageVector = Icons.Filled.Add, contentDescription = null)
//        }
//
//        var showToast by remember { mutableStateOf(false) }
//
//        Column {
//            PixelButton("Show Toast", onClick = { showToast = true }, modifier = Modifier.fillMaxWidth())
//            PixelToast(message = "Hello from PixelToast!", show = showToast) {
//                showToast = false
//            }
//        }
//
//        PixelTextField(
//            value = "",
//            onValueChange = {},
//            modifier = Modifier.fillMaxWidth(),
//            label = "Label",
//            placeholder = "Placeholder",
//        )
//
//        PixelButton(text = "Pixel Button 1", onClick = {
//            Toast.makeText(context, "Button Clicked Dismissed", Toast.LENGTH_SHORT).show()
//
//        }, modifier.fillMaxWidth())
//
////        PopText()
////
////        ButtonGreen()
////
//////        MineCraftButtonDismiss(text)
////        PixelButtonPrimary(text = "Accept", onClick = {
////            Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
////
////        }, modifier.height(60.dp).fillMaxWidth(0.5f))
////
////        PixelButtonDismiss(text = "Dismiss", onClick = {
////            Toast.makeText(context, "Button Clicked Dismissed", Toast.LENGTH_SHORT).show()
////
////        }, modifier.fillMaxWidth())
//    }
//
//}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    val context = LocalContext.current
//    var showToast by remember { mutableStateOf(false) }
//
//    var text by remember { mutableStateOf("") }
//    Box(modifier = Modifier.fillMaxSize()) {
//        // Main UI
//        Column(modifier = Modifier.padding(20.dp)) {
//            Text(
//                text = "Hello $name!",
//                modifier = modifier,
//                color = Green
//            )
//            IconButton(onClick = { /* do something */ }) {
//                Icon(imageVector = Icons.Filled.Add, contentDescription = null)
//            }
//
//            PixelButton("Show Toast - $text", onClick = { showToast = true }, modifier = Modifier.fillMaxWidth())
//
//            PixelTextField(
//                value = text,
//                onValueChange = {
//                    text = it
//                },
//                modifier = Modifier.fillMaxWidth(),
//                label = "Label",
//                placeholder = "Placeholder"
//            )
//
//            PixelButton(
//                text = "Pixel Button 1",
//                onClick = {
//                    Toast.makeText(context, "Button Clicked - $text", Toast.LENGTH_SHORT).show()
//                },
//                modifier = Modifier.fillMaxWidth()
//            )
//        }
//
//        // PixelToast OVERLAY (correct placement)
//        PixelToast(
//            message = "Hello from PixelToast!",
//            show = showToast,
//            onDismiss = { showToast = false }
//        )
//    }
//
//}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    var showToast by remember { mutableStateOf(false) }

    var text by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {
        // Main UI
        Column(modifier = Modifier.padding(20.dp)) {

//            PixelatedCard(content = {
//                Column {
//                    PixelText(text)
//                    PixelText(text, fontSize = 35.sp, color = Green)
//
//                }
//
//            })
//            Text(
//                text = "Hello $name!",
//                modifier = modifier,
//                color = Green
//            )
            IconButton(onClick = { /* do something */ }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = null)
            }

            PixelButton("Show Toast - $text", onClick = { showToast = true }, modifier = Modifier.fillMaxWidth())

            PixelTextField(
                value = text,
                onValueChange = {
                    text = it
                },
                modifier = Modifier.fillMaxWidth(),
                label = "Label",
                placeholder = "Placeholder"
            )

//            PixelCard(
//                title = "High Score",
//                backgroundColor = Color.Black,
//                borderColor = Color.Green,
//                contentColor = Color.White,
//                titleColor = Color.Yellow,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp)
//            ) {
//                Text(
//                    text = "Ashish: 9000",
//                    fontFamily = PixelFamilyBold,
//                    fontSize = 16.sp
//                )
//            }


//            PixelButton(
//                text = "Pixel Button 1",
//                onClick = {
//                    Toast.makeText(context, "Button Clicked - $text", Toast.LENGTH_SHORT).show()
//                },
//                modifier = Modifier.fillMaxWidth()
//            )

//            PixelOutlinedTextField(
//                value = text,
//                onValueChange = {
//                    text = it
//                },
//                modifier = Modifier.fillMaxWidth(),
//                label = "Label",
//                placeholder = "Placeholder"
//            )
//            PixelText(text)
//
            MinecraftPixelCard2(content = {
//                Text(text = "MINECRAFT",
//                    fontSize = 24.sp,
//                    fontWeight = FontWeight.Bold,
//                    fontFamily = FontFamily.Monospace,
//                    color = Color(0xFF2D2D2D),
//                )
                Column {
                    PixelText(text)
//                    PixelText(text, fontSize = 35.sp, color = Green)

                }

            })
//            PixelatedCard(content = {
//                Column {
//                    PixelText(text)
//                    PixelText(text, fontSize = 35.sp, color = Green)
//
//                }
//
//            })
//            PixelMCard()
//            PixelText(text, fontSize = 25.sp)
//            PixelText(text, fontSize = 35.sp, color = Green)
//            PixelText(text, fontSize = 35.sp, color = Red, fontWeight = FontWeight.Bold)
//            PixelText(text, fontSize = 35.sp, color = Green, maxLines = 2,)

//            Box(
//                modifier = Modifier
//                    .size(200.dp)
//                    .background(Color.Black)
//                    .shadow(0.dp, RoundedCornerShape(20.dp))
//                    .pixelatedBorder(borderColor = Color.Magenta,
//                        borderWidth = 4.dp, pixelSize = 6.dp),
//
//
//            ) {
//                Text(
//                    "Pixel Border",
//                    modifier = Modifier.align(Alignment.Center),
//                    color = Color.White
//                )
//            }

        }

        // PixelToast OVERLAY (correct placement)
        PixelToast(
            message = "Hello from PixelToast!",
            show = showToast,
            onDismiss = { showToast = false }
        )

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PopTextTheme {
        Greeting("Android")
    }
}


