package com.sophia.tinycivilization.view

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.sophia.tinycivilization.TinyCivGame
import ktx.app.KtxScreen
import ktx.assets.toInternalFile

class LoadingScreen(val game : TinyCivGame) : KtxScreen {

    private var countDown: Float = 5f
    private var stage: Stage = Stage(ScreenViewport())

    init {

        // Create a table that fills the screen. Everything else will go inside this table.
        val table = Table()
        table.setFillParent(true)
        table.debug = true
        stage.addActor(table)


        val skin = Skin("skin/glassy-ui.json".toInternalFile())

        val newGame = TextButton("Loading...", skin)

        table.defaults().padBottom(10f)
        table.add(newGame).fillX().uniformX().row()
    }

    override fun show() {
        Gdx.input.inputProcessor = stage
    }

    override fun render(delta: Float) {
        stage.act(delta)
        stage.draw()
        countDown -= delta;  // timer to stay on loading screen for short preiod once done loading
        if(countDown < 0) { // countdown is complete
            game.setScreen<MenuScreen>()
        }
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun dispose() {
        stage.dispose()
    }
}