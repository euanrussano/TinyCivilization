package com.sophia.tinycivilization.android

import android.os.Bundle

import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.sophia.tinycivilization.TinyCivGame

/** Launches the Android application. */
class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize(TinyCivGame(), AndroidApplicationConfiguration().apply {
            // Configure your application here.
        })
    }
}
