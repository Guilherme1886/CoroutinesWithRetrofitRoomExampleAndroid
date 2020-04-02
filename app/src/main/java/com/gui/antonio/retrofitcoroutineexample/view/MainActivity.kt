package com.gui.antonio.retrofitcoroutineexample.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gui.antonio.retrofitcoroutineexample.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent().setClassName(this, "com.gui.antonio.user.view.UserMainActivity"))
        finish()
    }
}
