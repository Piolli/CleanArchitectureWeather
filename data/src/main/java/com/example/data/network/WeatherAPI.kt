package com.example.data.network

import com.example.data.model.CityWeather
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by alexandr on 15.12.17.
 */
interface WeatherAPI {

    @GET()
    fun getWeatherByCityName(
            @Query("q") name: String,
            @Query("units") units: WeatherUnits
    ): Observable<CityWeather>

    enum class WeatherUnits { metric, imperial }

}