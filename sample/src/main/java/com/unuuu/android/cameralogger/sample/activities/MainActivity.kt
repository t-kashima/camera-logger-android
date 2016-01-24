package com.unuuu.android.cameralogger.sample.activities

import android.hardware.Camera
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.unuuu.android.cameralogger.CameraLogger
import com.unuuu.android.cameralogger.sample.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val camera = Camera.open()
            Log.d("MainActivity", CameraLogger(camera).toString())
        } catch (e : RuntimeException) {
            Log.e("MainActivity", e.message)
        }
    }
}
