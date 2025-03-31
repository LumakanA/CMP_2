package com.example.cmp_2.domain.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class OnBoardingItems(
    @DrawableRes val image: Int,
    @StringRes val title: Int,
    @StringRes val description: Int
)
