package com.example.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by alexandr on 15.12.17.
 */

class CityWeather {
    @SerializedName("name") lateinit var cityName: String
    @SerializedName("main") lateinit var mainInformation: MainInformation
    @SerializedName("main") lateinit var wind: Wind

    class Wind {
        @SerializedName("speed") var speed: Float = 0f
        @SerializedName("deg") var degress: Float = 0f
    }

    class MainInformation {
        @SerializedName("temp")     var temp: Float = 0f
        @SerializedName("presure")  var presure: Float = 0f
        @SerializedName("humidity") var humidity: Float = 0f
        @SerializedName("temp_max") var tempMax: Float = 0f
        @SerializedName("temp_min") var tempMin: Float = 0f
    }
}