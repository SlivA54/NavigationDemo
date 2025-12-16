// Home.kt
package com.example.navigationdemo.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.glance.text.TextStyle
import androidx.navigation3.runtime.NavKey
import com.example.navigationdemo.WelcomeScreen

// imports: Box, Column, Spacer, Button, OutlinedTextField, Text, etc.

@Composable
fun Home(onNavigation: (NavKey) -> Unit) {
    var userName by remember { mutableStateOf("") }
    val onTextChange = { text: String -> userName = text }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CustomTextField(title = "Enter your name", textState = userName, onTextChange = onTextChange)
            Spacer(modifier = Modifier.size(30.dp))
            Button(onClick = { onNavigation(WelcomeScreen(userName)) }) { Text("Register") }
        }
    }
}

@Composable
fun CustomTextField(title: String, textState: String, onTextChange: (String) -> Unit) {
    OutlinedTextField(value = textState, onValueChange = { onTextChange(it) }, singleLine = true,
        label = { Text(title) }, modifier = Modifier.padding(10.dp),
        textStyle = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp))
}
