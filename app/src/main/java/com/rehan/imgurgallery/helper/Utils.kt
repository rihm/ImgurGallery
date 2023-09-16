package com.rehan.imgurgallery.helper

import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

object Utils {

    @JvmStatic
    fun setStatusBarColor(activity: AppCompatActivity,color:Int){
        val window=activity.window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor=color

    }

    fun setFullScreen(activity: AppCompatActivity){
        activity.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
}