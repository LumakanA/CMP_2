package com.example.cmp_2.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cmp_2.presentation.screens.login.LoginScreen
import com.example.cmp_2.presentation.screens.onboarding.OnBoardingScreen
import org.koin.androidx.compose.koinViewModel

@Composable
fun NavGraph(navHostController: NavHostController, startScreen: String) {
    NavHost(
        navController = navHostController,
        startDestination = startScreen
    ) {
        composable(ScreenRouts.OnBoardingScreen.route) {
            OnBoardingScreen(
                navController = navHostController,
                vm = koinViewModel()
            )
        }
        composable(ScreenRouts.LoginScreen.route) {
            LoginScreen(
                navController = navHostController,
                vm = koinViewModel()
            )
        }
    }
}