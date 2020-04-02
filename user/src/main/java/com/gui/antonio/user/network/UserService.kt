package com.gui.antonio.user.network

import com.gui.antonio.user.network.response.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface UserService {

    @GET("/users")
    fun users(): Call<List<UserResponse>>

}