package com.gui.antonio.retrofitcoroutineexample.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gui.antonio.retrofitcoroutineexample.database.dao.UserDao
import com.gui.antonio.retrofitcoroutineexample.database.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class DatabaseApp : RoomDatabase() {
    abstract fun getUserDao(): UserDao
}


