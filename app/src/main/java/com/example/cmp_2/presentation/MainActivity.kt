package com.example.cmp_2.presentation

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.cmp_2.common.LanguageManager
import com.example.cmp_2.common.setLocale
import com.example.cmp_2.presentation.navigation.NavGraph
import com.example.cmp_2.presentation.navigation.ScreenRouts
import com.example.cmp_2.presentation.theme.CMP_2Theme
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val languageManager = LanguageManager(context = this)

        runBlocking {
            val language = languageManager.getLanguage()
            setLocale( this@MainActivity, language)
        }

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