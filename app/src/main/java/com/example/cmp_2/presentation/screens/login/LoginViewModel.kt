package com.example.cmp_2.presentation.screens.login

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.cmp_2.R
import com.example.cmp_2.domain.models.OnBoardingItems

class LoginViewModel: ViewModel() {
    private val _state = mutableStateOf(
        LoginState()
    )
    val state: State<LoginState> = _state

    fun updateEmail(email: String) {
        _state.value = state.value.copy(
            email = email
        )
    }
}

data class LoginState(
    val email: String = ""
)