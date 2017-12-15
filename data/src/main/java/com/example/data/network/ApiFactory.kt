package com.example.data.network

import com.example.data.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by alexandr on 15.12.17.
 */
object ApiFactory {
    val weatherService by lazy { createService() }

    private lateinit var sClient: OkHttpClient
    private lateinit var sApiWeather: WeatherAPI

    private fun createService(): WeatherAPI =
        Retrofit.Builder()
                .baseUrl(BuildConfig.API_ENDPOINT)
                .client(getClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(WeatherAPI::class.java)


    private fun getClient(): OkHttpClient =
        OkHttpClient.Builder()
                .addInterceptor(ApiKeyInterceptor())
                .build()

}