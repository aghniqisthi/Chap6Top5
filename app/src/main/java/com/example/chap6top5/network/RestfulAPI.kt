package com.example.chap6top5.network

import com.example.chap6top5.model.ResponseDataMakeupItem
import retrofit2.Call
import retrofit2.http.GET

interface RestfulAPI {
    @GET("api/v1/products.json")
    fun getAllMakeup(): Call<List<ResponseDataMakeupItem>>
}