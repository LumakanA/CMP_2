package com.example.cmp_2.data

import com.example.cmp_2.domain.Repository
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataModule = module {
    singleOf(::RepositoryImp) {
        bind<Repository>()
    }
    single {
        HttpClient(Android)
    }
}