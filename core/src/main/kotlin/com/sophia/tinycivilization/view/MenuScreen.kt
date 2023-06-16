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

        table.defaults().padBottom(10f)
        table.add(newGame).fillX().uniformX().row()
        table.add(preferences).uniformX().row()
        table.add(exit).fillX().uniformX()


        newGame.addListener(object : ChangeListener() {
            override fun changed(event: ChangeEvent?, actor: Actor?) {
                game.setScreen<MainScreen>()
            }
        })
        preferences.addListener(object : ChangeListener() {
            override fun changed(event: ChangeEvent?, actor: Actor?) {
                game.setScreen<PreferencesScreen>()
            }
        })
        exit.addListener(object : ChangeListener() {
            override fun changed(event: ChangeEvent?, actor: Actor?) {
                Gdx.app.exit()
            }
        })
    }

    override fun show() {
        Gdx.input.inputProcessor = stage
    }

    override fun render(delta: Float) {
        stage.act(delta)
        stage.draw()
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun dispose() {
        stage.dispose()
    }

}
