package com.unuuu.android.cameralogger.entities

import android.hardware.Camera
import com.google.gson.annotations.SerializedName

class CameraLoggerEntity(camera: Camera) {
    @SerializedName("Parameters")
    val parameters = camera.parameters
}