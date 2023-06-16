package com.sophia.tinycivilization

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Preferences


class AppPreferences {
    private val PREF_MUSIC_VOLUME = "volume"
    private val PREF_MUSIC_ENABLED = "music.enabled"
    private val PREF_SOUND_ENABLED = "sound.enabled"
    private val PREF_SOUND_VOL = "sound"
    private val PREFS_NAME = "tinyciv"

    protected fun getPrefs(): Preferences {
        return Gdx.app.getPreferences(PREFS_NAME)
    }

    fun isSoundEffectsEnabled(): Boolean {
        return getPrefs().getBoolean(PREF_SOUND_ENABLED, true)
    }

    fun setSoundEffectsEnabled(soundEffectsEnabled: Boolean) {
        getPrefs().putBoolean(PREF_SOUND_ENABLED, soundEffectsEnabled)
        getPrefs().flush()
    }

    fun isMusicEnabled(): Boolean {
        return getPrefs().getBoolean(PREF_MUSIC_ENABLED, true)
    }

    fun setMusicEnabled(musicEnabled: Boolean) {
        getPrefs().putBoolean(PREF_MUSIC_ENABLED, musicEnabled)
        getPrefs().flush()
    }

    fun getMusicVolume(): Float {
        return getPrefs().getFloat(PREF_MUSIC_VOLUME, 0.5f)
    }

    fun setMusicVolume(volume: Float) {
        getPrefs().putFloat(PREF_MUSIC_VOLUME, volume)
        getPrefs().flush()
    }

    fun getSoundVolume(): Float {
        return getPrefs().getFloat(PREF_SOUND_VOL, 0.5f)
    }

    fun setSoundVolume(volume: Float) {
        getPrefs().putFloat(PREF_SOUND_VOL, volume)
        getPrefs().flush()
    }
}