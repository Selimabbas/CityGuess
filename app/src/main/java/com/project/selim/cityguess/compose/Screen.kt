package com.project.selim.cityguess.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.selim.cityguess.MainViewModel

@Composable
fun Screen(viewModel: MainViewModel, modifier: Modifier = Modifier) {
    val countryName = viewModel.countryName.observeAsState().value ?: return
    val allCapitals = viewModel.predictions.observeAsState().value ?: return
    val state = viewModel.event.observeAsState().value ?: return

    val answer = remember { mutableStateOf("") }
    val errorState = state == MainViewModel.Event.Error
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(key1 = state) {
        when (state) {
            MainViewModel.Event.Success -> snackbarHostState.showSnackbar("Correct !")
            MainViewModel.Event.Error -> snackbarHostState.showSnackbar("Wrong !")
            is MainViewModel.Event.Skip ->
                snackbarHostState.showSnackbar("The answer was ${state.missedCapital}")

            MainViewModel.Event.None -> Unit
        }
    }
    Scaffold(
        modifier = modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(snackbarHostState) },
        content = {
            Column(modifier = Modifier.padding(it)) {
                Question(countryName)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = {
                            viewModel.answerGiven(answer.value)
                        },
                    ) {
                        Text("Answer")
                    }
                    Spacer(Modifier.height(8.dp))
                    Button(
                        onClick = {
                            viewModel.skipQuestion()
                        },
                    ) {
                        Text("Skip")
                    }
                }
                Answer(
                    allCapitals,
                    answer,
                    viewModel::onQueryChanged,
                    viewModel::onItemClicked,
                    modifier = Modifier.fillMaxWidth()
                        .padding(16.dp),
                    isError = errorState,
                )
            }
        }
    )
}

@Composable
fun Answer(
    allCapitals: List<String>,
    answer: MutableState<String>,
    onQueryChanged: (String) -> Unit,
    onItemClick: (String) -> Unit,
    modifier: Modifier = Modifier,
    isError: Boolean = false,
) {
    AutoCompleteTextView(
        modifier = modifier,
        query = answer.value,
        queryLabel = "",
        onQueryChanged = { query ->
            answer.value = query
            onQueryChanged(query)
        },
        predictions = allCapitals,
        onClearClick = {
            answer.value = ""
            onQueryChanged("")
        },
        onDoneActionClick = { },
        onItemClick = { item ->
            answer.value = item
            onItemClick(item)
        },
        isError = isError,
    ) {
        Text(it, fontSize = 14.sp)
    }
}

@Composable
fun Question(countryName: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 10.dp
    ) {
        Text("Find the capital of $countryName")
    }
}

@Composable
fun Answers(answers: List<String>, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        answers.forEach {
            Card {
                Text(text = it)
            }
        }

    }
}
