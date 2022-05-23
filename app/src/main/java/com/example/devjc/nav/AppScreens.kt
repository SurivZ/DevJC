package com.example.devjc.nav

sealed class AppScreens(val route: String) {
    object FirstScreen : AppScreens("first_screen")
    object SecondScreen : AppScreens("second_screen")
}
