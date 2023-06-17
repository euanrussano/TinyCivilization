package com.sophia.tinycivilization.view

import com.badlogic.ashley.core.Engine
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.utils.viewport.FitViewport
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.sophia.tinycivilization.TinyCivGame
import com.sophia.tinycivilization.controller.KeyboardController
import com.sophia.tinycivilization.ecs.system.RenderingSystem
import com.sophia.tinycivilization.ecs.system.TerrainRenderingSystem
import com.sophia.tinycivilization.model.GameFactory
import ktx.app.KtxScreen
import ktx.assets.toInternalFile


class MainScreen(val game: TinyCivGame) : KtxScreen{


    private lateinit var keyboardController: KeyboardController
    private lateinit var engine: Engine
    private val viewport = FitViewport(20f, 20f)

    init {
        game.assets.loadAssets()
    }
    override fun show() {

        keyboardController = KeyboardController()

        val gameFactory = GameFactory()
        engine = gameFactory.createGame()

        engine.addSystem(TerrainRenderingSystem(game.assets, SpriteBatch(), viewport))

        Gdx.input.inputProcessor = keyboardController
    }

    override fun render(delta: Float) {
        engine.update(delta)
    }

    override fun resize(width: Int, height: Int) {
        viewport.update(width, height)
    }

}
