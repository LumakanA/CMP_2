package com.example.cmp_2.presentation.screens.onboarding

import androidx.lifecycle.ViewModel
import com.example.cmp_2.R
import com.example.cmp_2.domain.models.OnBoardingItems

class OnBoardingViewModel: ViewModel() {
}

data class OnBoardingState(
    val onBoarding: List<OnBoardingItems> = listOf(
        OnBoardingItems(
            image = R.drawable.illustrations_1,
            title = R.string.confidence_in_your_words,
            description = R.string.with_conversation_based_learning_you_ll_be_talking_from_lesson_one
        ),
        OnBoardingItems(
            image = R.drawable.illustrations_2,
            title = R.string.take_your_time_to_learn,
            description = R.string.develop_a_habit_of_learning_and_make_it_a_part_of_your_daily_routine
        ),
        OnBoardingItems(
            image = R.drawable.illustrations_3,
            title = R.string.the_lessons_you_need_to_learn,
            description = R.string.using_a_variety_of_learning_styles_to_learn_and_retain
        ),
    )
)