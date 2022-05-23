package com.example.devjc.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.devjc.R

@Composable
fun SecondScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(content = {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow back",
                    modifier = Modifier.clickable { navController.popBackStack() }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Second screen")
            })
        },
        content = {
            SecondBodyContent(navController)
        }
    )
}

@Composable
fun SecondBodyContent(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        content = {
            Image(painterResource(R.drawable.ic_launcher_foreground), contentDescription = "Icon")
            Text(text = "Hi again, coder!")
            Button(onClick = { navController.popBackStack() }) {
                Text(text = "Go back")
            }
        }
    )
}