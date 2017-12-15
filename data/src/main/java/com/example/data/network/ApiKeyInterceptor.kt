package com.example.data.network

import com.example.data.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by alexandr on 15.12.17.
 */
class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain?): Response {
        var request = chain?.request()
        if(request != null) {
            val url = request.url().newBuilder()
                    .addQueryParameter("api_key", BuildConfig.API_KEY)
                    .build()
            request = request.newBuilder().url(url).build()
            TODO("Solve return parametr")
        }
    }
}