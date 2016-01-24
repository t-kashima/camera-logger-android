package com.unuuu.android.cameralogger.entities

import android.hardware.Camera
import com.google.gson.annotations.SerializedName


class LoggerEntity constructor() {
    @SerializedName("supportedVideoSizes")
    var supportedVideoSizes : List<Camera.Size>? = null;

    @SerializedName("supportedPreviewSizes")
    var supportedPreviewSizes : List<Camera.Size>? = null;
}