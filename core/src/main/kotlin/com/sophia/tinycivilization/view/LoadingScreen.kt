package com.sophia.tinycivilization.view

import com.sophia.tinycivilization.TinyCivGame
import ktx.app.KtxScreen

class LoadingScreen(val game : TinyCivGame) : KtxScreen {

    override fun render(delta: Float) {
        game.setScreen<MenuScreen>()
    }
}