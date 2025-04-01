package com.example.cmp_2.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cmp_2.R
import com.example.cmp_2.presentation.theme.Opacity_Dark
import com.example.cmp_2.presentation.theme.Opacity_Gray_Dark
import com.example.cmp_2.presentation.theme.defaultTextStyle

@Composable
fun AppTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    hintText: String = ""
) {
    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = {
            onValueChange(it)
        },
        shape = RoundedCornerShape(16.dp),
        textStyle = TextStyle(
            fontFamily = FontFamily(Font(R.font.fredoka_regular)),
            fontSize = 15.sp,
            lineHeight = 20.sp,
            color = Opacity_Gray_Dark
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Opacity_Dark,
            unfocusedContainerColor = Opacity_Dark,
            disabledContainerColor = Opacity_Dark,
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent
        ),
        placeholder = {
            Text(
                style = defaultTextStyle.header,
                text = hintText,
                color = Opacity_Gray_Dark
            )
        },
        singleLine = true
    )
}

@Preview
@Composable
fun AppTextFieldPreview() {
    AppTextField(value = "", onValueChange = {}, hintText = "1234234324")
}
