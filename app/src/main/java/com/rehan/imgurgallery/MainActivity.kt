package com.rehan.imgurgallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.rehan.imgurgallery.helper.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.setStatusBarColor(this@MainActivity,
            ContextCompat.getColor(applicationContext,R.color.primary_color))
        setContentView(R.layout.activity_main)

    }
}