package com.personal.weatherforecastapp.data.response.details

import com.google.gson.annotations.SerializedName

data class VolumeDetails(
    @SerializedName(value = "1h")
    val lastHourVolume: Double,
    @SerializedName(value = "3h")
    val lastThreeHoursVolume: Double
)