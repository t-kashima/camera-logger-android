package com.unuuu.android.cameralogger

import android.hardware.Camera

class CameraLogger {
    private var camera : Camera? = null

    constructor(camera : Camera) {
        this.camera = camera
    }

    override fun toString() : String {
        return getSupportedVideoSizes()
    }

    private fun getSupportedVideoSizes() : String {
        val parameters = this.camera?.parameters
        val supportedVideoSizes = parameters?.supportedVideoSizes
        var str = "";
        for (videoSize in supportedVideoSizes?.listIterator()) {
            str += "" + videoSize.width + ":" + videoSize.height + ", "
        }
        return str
    }
}


