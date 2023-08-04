package com.project.selim.cityguess.countries

import kotlinx.serialization.Serializable

@Serializable
data class Countries(val countries: List<SimpleCountry>)

@Serializable
data class SimpleCountry(
    val capital: List<String>,
    val name: Name,
    val flag: String,
)
