package com.example.cmp_2.data

import com.example.cmp_2.domain.Repository
import com.example.cmp_2.domain.models.Data
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

class RepositoryImp(private val client: HttpClient): Repository {

    override suspend fun login(login: String, password: String) {
        val response: HttpResponse = client.get("https://ktor.io/")
    }

    override fun getData(): Data {
        TODO("Not yet implemented")
    }
}