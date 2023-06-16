package com.sophia.tinycivilization.view

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.sophia.tinycivilization.TinyCivGame
import ktx.app.KtxScreen
import ktx.assets.toInternalFile

class MenuScreen(game: TinyCivGame) : KtxScreen {

    private var stage: Stage = Stage(ScreenViewport())

    init {


        // Create a table that fills the screen. Everything else will go inside this table.
        val table = Table()
        table.setFillParent(true)
        table.debug = true
        stage.addActor(table)


        val skin = Skin("skin/glassy-ui.json".toInternalFile())

        val newGame = TextButton("New Game", skin)
        val preferences = TextButton("Preferences", skin)
        val exit = TextButton("Exit", skin)

        table.add(newGame).fillX().uniformX();
        table.row().pad(10f, 0f, 10f, 0f);
        table.add(preferences).fillX().uniformX();
        table.row();
        table.add(exit).fillX().uniformX();


        Gdx.input.inputProcessor = stage
    }

    override fun render(delta: Float) {
        stage.act(delta)
        stage.draw()
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

}
