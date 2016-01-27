package com.unuuu.android.cameralogger

import android.hardware.Camera
import com.google.gson.GsonBuilder
import com.unuuu.android.cameralogger.entities.CameraLoggerEntity

class CameraLogger {
    private var logger : CameraLoggerEntity? = null

    constructor(camera : Camera) {
        logger = CameraLoggerEntity(camera)
    }

    override fun toString() : String {
        // enable pretty print
        val gson = GsonBuilder().setPrettyPrinting().create()
        return gson.toJson(logger)
    }
}