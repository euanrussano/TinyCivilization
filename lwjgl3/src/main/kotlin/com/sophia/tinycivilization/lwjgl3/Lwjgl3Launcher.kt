@file:JvmName("Lwjgl3Launcher")

package com.sophia.tinycivilization.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.sophia.tinycivilization.TinyCivGame

/** Launches the desktop (LWJGL3) application. */
fun main() {
    Lwjgl3Application(TinyCivGame(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("TinyCivilization")
        setWindowedMode(640, 480)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
