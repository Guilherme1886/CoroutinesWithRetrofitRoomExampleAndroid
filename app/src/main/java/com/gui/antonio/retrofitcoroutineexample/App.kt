package com.gui.antonio.retrofitcoroutineexample

import android.app.Application
import androidx.room.Room
import com.gui.antonio.retrofitcoroutineexample.database.DatabaseApp

class App : Application() {

    companion object {
        var db: DatabaseApp? = null
    }
    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this, DatabaseApp::class.java, "database_app").build()
    }
}