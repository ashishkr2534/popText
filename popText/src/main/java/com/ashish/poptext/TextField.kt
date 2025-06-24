package com.ashish.poptext

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.graphics.Color


/**
 * Created by Ashish Kr on 24,June,2025
 */
@Composable
fun PixelTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String = "",
    placeholder: String = "",
    isPassword: Boolean = false,
    singleLine: Boolean = true
) {
    var passwordVisible by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            if (label.isNotEmpty()) {
                Text(label, fontFamily = PixelFamilyBold)
            }
        },
        placeholder = {
            if (placeholder.isNotEmpty()) {
                Text(placeholder, fontFamily = PixelFamilyBold)
            }
        },
        textStyle = TextStyle(
            fontFamily = PixelFamilyBold,
            fontSize = 16.sp
        ),
        singleLine = singleLine,
        visualTransformation = if (isPassword && !passwordVisible)
            PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {
            if (isPassword) {
                val icon = if (passwordVisible) Icons.Filled.CheckCircle else Icons.Filled.Lock
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = icon, contentDescription = null)
                }
            }
        },
        modifier = modifier,
        shape = RoundedCornerShape(8.dp)
    )
}


@Composable
fun PixelOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String = "",
    placeholder: String = "",
    textColor: Color = Color.White,
    labelColor: Color = Color.Gray,
    placeholderColor: Color = Color.LightGray,
    borderColor: Color = Color.White,
    focusedBorderColor: Color = Color.Cyan
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        label = {
            Text(
                text = label,
                fontFamily = PixelFamilyBold,
                color = labelColor
            )
        },
        placeholder = {
            Text(
                text = placeholder,
                fontFamily = PixelFamilyBold,
                color = placeholderColor
            )
        },
        textStyle = LocalTextStyle.current.copy(
            fontFamily = PixelFamilyBold,
            color = textColor
        ),
        colors = TextFieldDefaults.colors(
            focusedTextColor = textColor,
            unfocusedTextColor = textColor,
            cursorColor = focusedBorderColor,
            focusedLabelColor = labelColor,
            unfocusedLabelColor = labelColor,
//            focusedBorderColor = focusedBorderColor,
//            unfocusedBorderColor = borderColor,
//            focusedTextColor = textColor,
//            unfocusedTextColor = textColor,
//            cursorColor = focusedBorderColor,
//            focusedLabelColor = labelColor,
//            unfocusedLabelColor = labelColor,
//            placeholderColor = placeholderColor
        )
    )
}

