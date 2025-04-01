package com.example.cmp_2.presentation.screens.login

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cmp_2.R
import com.example.cmp_2.common.AppButton
import com.example.cmp_2.common.AppTextField
import com.example.cmp_2.common.LanguageManager
import com.example.cmp_2.common.setLocale
import com.example.cmp_2.presentation.theme.localColorSystem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.w3c.dom.Text

@Composable
fun LoginScreen(
    navController: NavController,
    vm: LoginViewModel
) {

    val languageManager = LanguageManager(LocalContext.current)
    val coroutineScope = rememberCoroutineScope()
    val state = vm.state.value

    Scaffold(
        modifier = Modifier
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 24.dp)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                Spacer(modifier = Modifier.height(24.dp))

                Image(
                    modifier = Modifier
                        .width(105.dp)
                        .height(82.dp)
                        .align(Alignment.CenterHorizontally),
                    painter = painterResource(R.drawable.login_image),
                    contentDescription = null
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = stringResource(R.string.for_free_join_now_and_start_learning),
                    fontFamily = FontFamily(Font(R.font.fredoka_medium)),
                    fontSize = 22.sp,
                    lineHeight = 28.sp,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = stringResource(R.string.email_address),
                    fontFamily = FontFamily(Font(R.font.fredoka_regular)),
                    fontSize = 15.sp,
                    lineHeight = 20.sp,
                    color = localColorSystem.current.text1
                )

                Spacer(modifier = Modifier.height(8.dp))

                AppTextField(
                    value = state.email,
                    onValueChange = {
                        vm.updateEmail(it)
                    },
                    hintText = "Email"
                )

                Spacer(modifier = Modifier.height(24.dp))

                AppButton(
                    modifier = Modifier
                        .height(56.dp)
                        .size(326.dp)
                        .align(Alignment.CenterHorizontally),
                    text = "ru",
                    onClick = {
                        coroutineScope.launch {
                            languageManager.setLanguage("ru")
                        }
                    }
                )

                Spacer(modifier = Modifier.height(16.dp))

                AppButton(
                    modifier = Modifier
                        .height(56.dp)
                        .size(326.dp)
                        .align(Alignment.CenterHorizontally),
                    text = "en",
                    onClick = {
                        coroutineScope.launch {
                            languageManager.setLanguage("en")

                        }
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        navController = rememberNavController(),
        vm = LoginViewModel()
    )
}