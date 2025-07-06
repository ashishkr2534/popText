package com.ashish.poptext

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashish.composeglassified.CustomGlassifiedCard
import com.ashish.composeglassified.GlassifiedCard


/**
 * Created by Ashish Kr on 25,June,2025
 */
@Composable
fun AllItems(){
    val context = LocalContext.current
    var text by remember { mutableStateOf("") }

    var showDialog by remember { mutableStateOf(false) }

//    if (showDialog) {
//        PixelAlertDialog(
//            onDismissRequest = { showDialog = false },
//            title = "Delete World?",
//            text = "Are you sure you want to delete this Minecraft world? This action cannot be undone.",
//            confirmButtonText = "Delete",
//            onConfirm = { showDialog = false },
//            dismissButtonText = "Cancel",
//            onDismiss = { showDialog = false }
//        )
//    }
    if (showDialog) {
        PixelAlertDialogCustom(
            onDismissRequest = { showDialog = false },
            title = {
                Text(
                    text = "Pixel Confirm",
                    fontFamily = PixelFamilyBold,
                    fontSize = 20.sp,
                    color = Color(0xFF2E2E2E)
                )
            },
            text = {
                Text(
                    text = "Do you want to save your progress before exiting?",
                    fontFamily = PixelFamilyRegular,
                    fontSize = 16.sp,
                    color = Color(0xFF2E2E2E)
                )
            },
            confirmButton = {
                PixelButton(
                    text = "Yes",
                    onClick = { /* Confirm action */ showDialog = false },
                    textColor = Color.White,
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6BBF59))
                )
            },
            dismissButton = {
                PixelButton(
                    text = "No",
                    onClick = { showDialog = false },
                    textColor = Color.Black,
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFAAAAAA))
                )
            }
        )
    }



    Column(modifier = Modifier
        .padding(top = 40.dp, start = 10.dp, end = 10.dp)
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Row (Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
           PixelText("Pixel Pop Library - Minecraft Alike")


        }
        Column {
            Row (Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                Text("Pixel Text ")
                PixelText("PixelText ")
            }
        }

        PixelButtonPrimary(
            text = "Primary", onClick = {
               Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
        )
        PixelButtonDismiss(
            text = "Dismiss Rohit", onClick = {
               Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
        )
        PixelButton(
            text = "Pixel Button", onClick = {
               Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
        )
        PixelOutlinedButton(
            text = "Outlined Button", onClick = {
               Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier,
            textColor = Color.Green,
            borderColor = Color.Green
        )
        PixelText(text)
        PixelTextField(value = text,
            onValueChange = {
                text = it
            },
            label = "Label",
            placeholder = "Enter string")
        PixelOutlinedTextField(value = text,
            onValueChange = {
                text = it
            },
            label = "Label 1",
            placeholder = "Enter new String")

        Spacer(modifier = Modifier.height(10.dp))
        MinecraftPixelCard(
            content = {
                PixelText(text)
                Column(
                    modifier = Modifier.fillMaxSize(),

                )
                {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Column {
                            PixelText("Ashish Kumar",
                                fontSize = 28.sp, color = Color.Red)
                            PixelText("Android App Developer",color = Color.Magenta)
                        }
                    }

                    Spacer(modifier = Modifier.height(15.dp))
                    Row( modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start) {

                        PixelText("This card is here for the user name and there profile details to" +
                                "be viewed and seen to public",color = Color.Black)
                    }

                }
            }
        )

        Spacer(modifier = Modifier.height(20.dp))
        PixelCard(
                title = "High Text Pixel",
                backgroundColor = Color.Black,
                borderColor = Color.Green,
                contentColor = Color.White,
                titleColor = Color.Yellow,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
//                PixelText(
//                    text = text,
////                    fontFamily = PixelFamilyBold,
//                    fontSize = 16.sp
//                )
            Column(
                modifier = Modifier.fillMaxSize(),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        PixelText("Ashish Kumar",
                            fontSize = 25.sp, color = White)
                        PixelText("Android App Developer",color = White)
                    }
                }

                Spacer(modifier = Modifier.height(15.dp))
//                Row( modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.Start) {
//
//                    Text("This card is here for the user name and there profile details to" +
//                            "be viewed and seen to public",color = White)
//
//
//                }

            }
            }

        var showToast by remember { mutableStateOf(false) }
        PixelOutlinedButton("Show Toast", onClick = { showToast = true },
            modifier = Modifier.fillMaxWidth(),
            textColor = Color.Black,
            borderColor = Color.Black)
            PixelToast(message = "Hello from PixelToast!", show = showToast) {
                showToast = false
            }


    }
}

@Preview
@Composable
fun AllItemsPreview(){
    AllItems()
}