package com.project.selim.cityguess.countries

import android.app.Application
import kotlinx.serialization.json.Json
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CountryRepository @Inject constructor(application: Application) {

    var simpleCountries: Countries
    private var allCapitals: List<String>

    init {
        val json = application.assets.open(countryFileName).bufferedReader().readText()
        simpleCountries = Json { ignoreUnknownKeys = true }.decodeFromString(json)
        allCapitals = simpleCountries.countries.map { it.capital.first() }.sorted()
    }

    /*
        val simplifiedCountries = countries.map {
            SimpleCountry(
                it.capital,
                it.name,
                it.flag,
            )
        }
    */

    fun randomCapitals(number: Int): List<String> = allCapitals.shuffled().take(number)

    fun allCapitals() = allCapitals

    companion object {
        const val countryFileName = "countries.json"
    }
}