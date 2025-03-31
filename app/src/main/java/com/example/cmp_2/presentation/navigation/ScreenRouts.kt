package com.example.cmp_2.presentation.navigation

sealed class ScreenRouts(val route: String) {
    data object OnBoardingScreen: ScreenRouts("OnBoardingScreen")
}