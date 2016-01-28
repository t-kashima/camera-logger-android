Camera Logger
============
This library can easily get the camera parameters.

Example
-------

How to display all the camera parameters.

```kotlin
try {
    val camera = Camera.open()
    Log.d(TAG, CameraLogger(camera).toString())
} catch (e: RuntimeException) {
    Log.e(TAG, e.message)
}
```
