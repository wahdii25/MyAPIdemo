package my.edu.tarc.myapidemo.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(MyRestAPI.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api:MyRestAPI by lazy{
        retrofit.create(MyRestAPI::class.java)
    }
}