package com.example.driverapp.data

data class DriverStats(
    val username: String,
    val loginHours: Int,
    val completedTrips: Int,
    val cancelledTrips: Int,
    val last30Days: SummaryStats
)

data class SummaryStats(
    val totalLoginHours: Int,
    val totalCompletedTrips: Int,
    val totalCancelledTrips: Int
)

// Sample Data
val driver1 = DriverStats(
    username = "driver1",
    loginHours = 8,
    completedTrips = 5,
    cancelledTrips = 1,
    last30Days = SummaryStats(200, 150, 10)
)

val driver2 = DriverStats(
    username = "driver2",
    loginHours = 3,
    completedTrips = 2,
    cancelledTrips = 3,
    last30Days = SummaryStats(100, 50, 30)
)

val users = mapOf(
    "driver1" to "password1",
    "driver2" to "password2"
)