package com.heijin.driverapp

import retrofit2.Call
import retrofit2.http.GET

interface PrlgApiAuth {
    @GET("messages1.json")
    fun messages(): Call<List<Message>>
}

class Message {
    var id: Long = 0
    var time: Long = 0
    var text: String = ""
    var image: String = ""
}

