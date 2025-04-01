package com.example.cmp_2.presentation.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

data class AppTextStyle(
    val header: TextStyle
)

val defaultTextStyle = AppTextStyle(
    header = TextStyle(
        fontSize = 14.sp
    )
)