package com.gui.antonio.user.repository

import com.gui.antonio.retrofitcoroutineexample.database.entity.UserEntity

interface IUserRepository {
    fun users(): List<UserEntity>
}