package com.project.selim.cityguess

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.project.selim.cityguess.compose.Screen
import com.project.selim.cityguess.ui.theme.CityGuessTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CityGuessTheme {
                // A surface container using the 'background' color from the theme
                Screen(viewModel = viewModel)
            }
        }
    }
}
