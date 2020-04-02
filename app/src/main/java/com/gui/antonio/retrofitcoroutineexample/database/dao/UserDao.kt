package com.gui.antonio.retrofitcoroutineexample.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.gui.antonio.retrofitcoroutineexample.database.entity.UserEntity

@Dao
abstract class UserDao {

    @Insert
    abstract fun addUser(userEntity: UserEntity)

    @Query("SELECT * FROM user")
    abstract fun getUsers(): List<UserEntity>

}