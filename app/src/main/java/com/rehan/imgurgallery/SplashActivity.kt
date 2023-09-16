package com.rehan.imgurgallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.content.ContextCompat
import com.rehan.imgurgallery.helper.Utils

class SplashActivity : AppCompatActivity() {
    var activity : AppCompatActivity?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.setStatusBarColor(this@SplashActivity,
            ContextCompat.getColor(applicationContext,R.color.primary_color))
        Utils.setFullScreen(this@SplashActivity)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}