package com.example.cmp_2.common

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.util.Locale

// At the top level of your kotlin file:
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

class LanguageManager (private val context: Context) {

    private val LANGUAGE_KEY = stringPreferencesKey("language")

    suspend fun getLanguage(): String {
        return context.dataStore.data.map { prefs ->
            prefs[LANGUAGE_KEY] ?: Locale.getDefault().language
        }.first()
    }

    suspend fun setLanguage(languageCode: String) {
        context.dataStore.edit { pref ->
            pref[LANGUAGE_KEY] = languageCode
        }
    }
}

fun setLocale(context: Context, languageCode: String) {
    val locale = Locale(languageCode)
    Locale.setDefault(locale)

    val config = Configuration()
    config.setLocale(locale)

    context.resources.updateConfiguration(config, context.resources.displayMetrics)
}
