package com.example.cmp_2.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.cmp_2.presentation.navigation.NavGraph
import com.example.cmp_2.presentation.navigation.ScreenRouts
import com.example.cmp_2.presentation.theme.CMP_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CMP_2Theme {
                val navController = rememberNavController()
                NavGraph(
                    navHostController = navController,
                    startScreen = ScreenRouts.OnBoardingScreen.route
                )
            }
        }
    }
}