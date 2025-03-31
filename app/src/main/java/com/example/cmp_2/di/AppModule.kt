package com.example.cmp_2.di

import com.example.cmp_2.presentation.screens.onboarding.OnBoardingViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        OnBoardingViewModel()
    }
}