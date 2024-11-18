package com.example.driverapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.driverapp.data.driver1
import com.example.driverapp.data.driver2
import com.example.driverapp.ui.HomeScreen
import com.example.driverapp.ui.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var currentUser by remember { mutableStateOf<String?>(null) }

            if (currentUser == null) {
                LoginScreen(onLoginSuccess = { username ->
                    currentUser = username
                })
            } else {
                val driverStats = if (currentUser == "driver1") driver1 else driver2
                HomeScreen(driverStats = driverStats)
            }
        }
    }
}
