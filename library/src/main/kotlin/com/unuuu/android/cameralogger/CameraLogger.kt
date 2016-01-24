package com.unuuu.android.cameralogger

import android.hardware.Camera
import com.google.gson.Gson
import com.unuuu.android.cameralogger.entities.LoggerEntity

class CameraLogger {
    private var logger : LoggerEntity? = null

    constructor(camera : Camera) {
        logger = LoggerEntity()
        logger?.supportedVideoSizes = getSupportedVideoSizes(camera)
        logger?.supportedPreviewSizes = getSupportedPreviewSizes(camera)
    }

    override fun toString() : String {
        return Gson().toJson(logger)
    }

    /**
     * get supported video sizes
     *
     * @param camera camera
     * @return a list of supported video sizes
     */
    private fun getSupportedVideoSizes(camera : Camera) : List<Camera.Size>? {
        return camera?.parameters?.supportedVideoSizes
    }

    /**
     * Get supported preview sizes
     *
     * @param camera camera
     * @return a list of supported preview sizes
     */
    private fun getSupportedPreviewSizes(camera : Camera) : List<Camera.Size>? {
        return camera?.parameters?.supportedPreviewSizes
    }
}


