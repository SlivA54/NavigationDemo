package com.example.navigationdemo

// Welcome.kt
@Composable
fun Welcome(onNavigation: (NavKey) -> Unit, name: String = "") {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Welcome $name", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.size(30.dp))
            Button(onClick = { onNavigation(ProfileScreen) }) { Text("Set up your Profile") }
        }
    }
}
