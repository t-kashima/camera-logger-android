package com.unuuu.android.cameralogger.entities

import android.hardware.Camera
import com.google.gson.annotations.SerializedName

class CameraLoggerEntity {
    @SerializedName("Parameters")
    var parameters : Camera.Parameters? = null

    constructor(camera : Camera) {
        parameters = camera?.parameters
    }
}