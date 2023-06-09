package com.sophia.tinycivilization

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.sophia.tinycivilization.asset.Assets
import com.sophia.tinycivilization.view.LoadingScreen
import com.sophia.tinycivilization.view.MainScreen
import com.sophia.tinycivilization.view.MenuScreen
import com.sophia.tinycivilization.view.PreferencesScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.app.clearScreen
import ktx.assets.disposeSafely
import ktx.assets.toInternalFile
import ktx.graphics.use

class TinyCivGame : KtxGame<KtxScreen>() {

    val preferences = AppPreferences()
    val assets = Assets()
    override fun create() {
        addScreen(LoadingScreen(this))
        addScreen(MenuScreen(this))
        addScreen(PreferencesScreen(this))
        addScreen(MainScreen(this))

        setScreen<LoadingScreen>()
    }
}

class FirstScreen : KtxScreen {
    private val image = Texture("logo.png".toInternalFile(), true).apply { setFilter(Linear, Linear) }
    private val batch = SpriteBatch()

    override fun render(delta: Float) {
        clearScreen(red = 0.7f, green = 0.7f, blue = 0.7f)
        batch.use {
            it.draw(image, 100f, 160f)
        }
    }

    override fun dispose() {
        image.disposeSafely()
        batch.disposeSafely()
    }
}
