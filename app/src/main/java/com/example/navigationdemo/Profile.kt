package com.example.navigationdemo

// Profile.kt
@Composable
fun Profile(onClearBackStack: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Setup your profile", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.size(30.dp))
            Button(onClick = { onClearBackStack() }) { Text("Go Home") }
        }
    }
}
