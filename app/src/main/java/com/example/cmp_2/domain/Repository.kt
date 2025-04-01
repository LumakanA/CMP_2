package com.example.cmp_2.domain

import com.example.cmp_2.domain.models.Data

interface Repository {
    suspend fun login(login: String, password: String)
    fun getData(): Data
}