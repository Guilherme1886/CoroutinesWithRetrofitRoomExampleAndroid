package com.gui.antonio.user.network

import com.gui.antonio.retrofitcoroutineexample.network.RetrofitConfiguration

object UserRetrofitConfiguration {
    val service = RetrofitConfiguration.retrofit.create(UserService::class.java)
}