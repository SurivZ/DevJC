package com.example.devjc.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.devjc.nav.AppScreens

@Composable
fun FirstScreen(navController: NavController) {
    Scaffold(
        topBar = { TopAppBar(content = { Text(text = "First screen") }) },
        content = { BodyContent(navController) }
    )
}

@Composable
fun BodyContent(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        content = {
            Text(text = "Hi, coder!")
            Button(onClick = { navController.navigate(route = AppScreens.SecondScreen.route) }) {
                Text(text = "Go")
            }
        }
    )
}