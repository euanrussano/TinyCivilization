package com.sophia.tinycivilization.view

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.sophia.tinycivilization.TinyCivGame
import ktx.app.KtxScreen
import ktx.assets.toInternalFile

class LoadingScreen(val game : TinyCivGame) : KtxScreen {


    val IMAGE = 0 // loading images
    val FONT = 1 // loading fonts
    val PARTY = 2 // loading particle effects
    val SOUND = 3 // loading sounds
    val MUSIC = 4 // loading music
    val FINISHED = 5 // finish and setup

    private var currentLoadingStage: Int = 0
    private var countDown: Float = 3f

    private var loadingText: Label
    private var progressBar: ProgressBar

    private var stage: Stage = Stage(ScreenViewport())

    init {

        game.assets.queueAddImages()

        // Create a table that fills the screen. Everything else will go inside this table.
        val table = Table()
        table.setFillParent(true)
        table.debug = true
        stage.addActor(table)


        val skin = Skin("skin/glassy-ui.json".toInternalFile())

        val loadingLabel = Label("Loading...", skin)
        progressBar = ProgressBar(0f, 1f, 0.1f, false, skin)
        loadingText = Label("Loading Images...", skin)


        table.defaults().padBottom(10f)
        table.add(loadingLabel).fillX().uniformX().row()
        table.add(progressBar).fillX().uniformX().row()
        table.add(loadingText).fillX().uniformX().row()
    }

    override fun show() {
        Gdx.input.inputProcessor = stage
    }

    override fun render(delta: Float) {
        stage.act(delta)
        stage.draw()
        if (game.assets.manager.update()) { // Load some, will return true if done loading
            currentLoadingStage += 1;
            when(currentLoadingStage){
                FONT -> {
                    loadingText.setText("Loading fonts....");
                    game.assets.queueAddFonts(); // first load done, now start fonts
                }
                PARTY -> {
                    loadingText.setText("Loading Particle Effects....");
                    game.assets.queueAddParticleEffects(); // fonts are done now do party effects
                }
                SOUND -> {
                    loadingText.setText("Loading Sounds....");
                    game.assets.queueAddSounds(); // fonts are done now do party effects
                }
                MUSIC -> {
                    loadingText.setText("Loading Music....");
                    game.assets.queueAddMusic(); // fonts are done now do party effects
                }
                FINISHED -> {
                    loadingText.setText("Finished");
                    game.assets.setupAssets()
                }

            }
            if (currentLoadingStage > 5) {
                countDown -= delta;  // timer to stay on loading screen for short preiod once done loading
                if (countDown < 0) { // countdown is complete
                    game.setScreen<MenuScreen>()
                }
            }
        }
        progressBar.value = game.assets.manager.progress
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun dispose() {
        stage.dispose()
    }
}