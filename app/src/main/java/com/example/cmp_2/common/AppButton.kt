package com.example.cmp_2.common

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cmp_2.R
import com.example.cmp_2.presentation.theme.Blue

@Composable
fun AppButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    text: String = ""
)  {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonColors(Blue, Color.White, Blue, Blue)
    ) {
        Text(
            text = text,
            fontFamily = FontFamily(Font(R.font.fredoka_medium)),
            fontSize = 20.sp,
            lineHeight = 24.sp
        )
    }
}

@Preview
@Composable
fun AppButtonPreview() {
    AppButton()
}

