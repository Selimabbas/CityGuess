package com.project.selim.cityguess

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.project.selim.cityguess.countries.CountryRepository
import com.project.selim.cityguess.countries.SimpleCountry
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val countryRepository: CountryRepository
) : ViewModel() {

    private var countryList: MutableList<SimpleCountry> =
        countryRepository.simpleCountries
            .countries
            .filter { it.capital.isNotEmpty() && it.capital.first().isNotEmpty() }
            .shuffled()
            .toMutableList()

    private var country = nextCountry()

    private val _countryName = MutableLiveData(country.name.common)
    val countryName: LiveData<String> get() = _countryName

    private val _answers: MutableLiveData<List<String>> = MutableLiveData(createAnswers())

    var answers: LiveData<List<String>> = _answers

    private val _predictions: MutableLiveData<List<String>> = MutableLiveData(emptyList())

    var predictions: LiveData<List<String>> = _predictions

    private val _event: MutableLiveData<Event> = MutableLiveData(Event.None)

    var event: LiveData<Event> = _event


    private fun createAnswers(): List<String> =
        mutableListOf(country.capital.first()) + countryRepository.randomCapitals(3)

    private fun nextCountry() = countryList.removeFirst()

    fun answerGiven(answer: String) {
        if (answer == country.capital.first()) {
            _event.value = Event.Success
            updateCountry()
        } else {
            _event.value = Event.Error
        }
    }

    private fun updateCountry() {
        country = nextCountry()
        _countryName.value = country.name.common
        viewModelScope.launch {
            delay(1000)
            _event.value = Event.None
        }
    }

    fun onQueryChanged(query: String) {
        _predictions.value = if (query.isNotEmpty()) countryRepository.allCapitals()
            .filter { it.lowercase().contains(query.lowercase()) }
        else emptyList()
    }

    fun onItemClicked(item: String) {
        _predictions.value = emptyList()
    }

    fun skipQuestion() {
        _event.value = Event.Skip(country.capital.first())
        updateCountry()
        _predictions.value = emptyList()
    }

    sealed class Event {
        object None : Event()
        object Error : Event()
        object Success : Event()
        data class Skip(val missedCapital: String) : Event()
    }
}