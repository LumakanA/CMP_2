package com.example.cmp_2.presentation.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cmp_2.R
import com.example.cmp_2.common.AppButton

@Composable
fun OnBoardingScreen(
    navController: NavController,
    vm: OnBoardingViewModel
) {

    val state = OnBoardingState()

    val pagerState = rememberPagerState {
        3
    }

    Scaffold(
        modifier = Modifier
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 24.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            HorizontalPager(state = pagerState) { page ->
                Column(
                    modifier = Modifier.verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(40.dp))

                    Image(
                        modifier = Modifier
                            .width(240.dp)
                            .height(220.dp),
                        painter = painterResource(state.onBoarding[page].image),
                        contentDescription = null
                    )

                    Spacer(modifier = Modifier.height(114.dp))

                    Image(
                        modifier = Modifier
                            .width(40.dp)
                            .height(8.dp),
                        painter = painterResource(R.drawable.slider),
                        contentDescription = null
                    )

                    Spacer(modifier = Modifier.height(40.dp))

                    Text(
                        text = stringResource(state.onBoarding[page].title),
                        fontFamily = FontFamily(Font(R.font.fredoka_medium)),
                        fontSize = 22.sp,
                        lineHeight = 28.sp
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = stringResource(state.onBoarding[page].description),
                        fontFamily = FontFamily(Font(R.font.fredoka_regular)),
                        fontSize = 15.sp,
                        lineHeight = 20.sp
                    )

                    Spacer(modifier = Modifier.height(50.dp))

                    AppButton(
                        modifier = Modifier
                            .height(56.dp)
                            .size(326.dp),
                        text = when (page) {
                            0 -> {
                                stringResource(R.string.next)
                            }
                            1 -> {
                                stringResource(R.string.more)
                            }
                            else -> {
                                stringResource(R.string.choose_a_language)
                            }
                        }
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Skip onboarding",
                        fontFamily = FontFamily(Font(R.font.fredoka_regular)),
                        fontSize = 15.sp,
                        lineHeight = 20.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingScreenPreview() {
    OnBoardingScreen(
        navController = rememberNavController(),
        vm = OnBoardingViewModel()
    )
}