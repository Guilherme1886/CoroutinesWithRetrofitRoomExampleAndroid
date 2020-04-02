package com.gui.antonio.user.repository

import com.gui.antonio.retrofitcoroutineexample.App
import com.gui.antonio.retrofitcoroutineexample.database.entity.UserEntity
import com.gui.antonio.user.network.UserRetrofitConfiguration
import com.gui.antonio.user.network.response.UserResponse

class UserRepository : IUserRepository {

    private val instanceDB = App.db?.getUserDao()

    override fun users(): List<UserEntity> {
        val response = UserRetrofitConfiguration.service.users().execute()
        if (response.isSuccessful) response.body()?.let { saveUserInStorage(it) }
        return instanceDB!!.getUsers()
    }

    private fun saveUserInStorage(result: List<UserResponse>) {
        result.forEach {
            val userEntity = UserEntity(
                name = it.name.toString(),
                username = it.username.toString(),
                email = it.email.toString()
            )
            instanceDB?.addUser(userEntity)
        }
    }
}