package com.example.driverapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.driverapp.data.DriverStats
import com.example.driverapp.ui.components.StatsCard
import com.example.driverapp.ui.components.GraphComponent

@Composable
fun HomeScreen(driverStats: DriverStats) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Welcome, ${driverStats.username}",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary
        )

        StatsCard(
            title = "Today's Stats",
            stats = listOf(
                "Login Hours: ${driverStats.loginHours} hrs",
                "Completed Trips: ${driverStats.completedTrips}",
                "Cancelled Trips: ${driverStats.cancelledTrips}"
            )
        )

        GraphComponent(
            title = "Last 30 Days Summary",
            data = mapOf(
                "Login Hours" to driverStats.last30Days.totalLoginHours,
                "Completed Trips" to driverStats.last30Days.totalCompletedTrips,
                "Cancelled Trips" to driverStats.last30Days.totalCancelledTrips
            )
        )

        Spacer(modifier = Modifier.weight(1f)) // Push the Logout Button to the bottom
        
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Logout")
        }
    }
}
