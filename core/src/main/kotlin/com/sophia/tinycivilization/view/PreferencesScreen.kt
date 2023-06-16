package com.sophia.tinycivilization.view

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.Slider
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.sophia.tinycivilization.TinyCivGame
import ktx.app.KtxScreen
import ktx.assets.toInternalFile


class PreferencesScreen(game: TinyCivGame) : KtxScreen{

    private var stage: Stage = Stage(ScreenViewport())

    val skin = Skin("skin/glassy-ui.json".toInternalFile())

    // our new fields
    val titleLabel = Label( "Preferences", skin );
    val volumeMusicLabel = Label( "Music Volume", skin );
    val volumeSoundLabel = Label( "Sound Volume", skin );
    val musicOnOffLabel = Label( "Music", skin );
    val soundOnOffLabel = Label( "Sound", skin );
    init {

        // Create a table that fills the screen. Everything else will go inside this table.
        val table = Table()
        table.setFillParent(true)
//        table.debug = true
        stage.addActor(table)


        //music slide
        val soundMusicSlider = Slider(0f, 1f, 0.1f, false, skin)
        soundMusicSlider.value =
            game.preferences.getSoundVolume()
        soundMusicSlider.addListener{ it ->
            game.preferences.setMusicVolume(soundMusicSlider.value)
            false
        }

        //volume
        val volumeMusicSlider = Slider(0f, 1f, 0.1f, false, skin)
        volumeMusicSlider.value =
            game.preferences.getMusicVolume()
        volumeMusicSlider.addListener{ it ->
                game.preferences.setMusicVolume(volumeMusicSlider.value)
                false
        }


        //music
        val musicCheckbox = CheckBox(null, skin)
        musicCheckbox.isChecked = game.preferences.isMusicEnabled()
        musicCheckbox.addListener {
            val enabled = musicCheckbox.isChecked
            game.preferences.setMusicEnabled(enabled)
            false
        }

        //music
        val soundEffectsCheckbox = CheckBox(null, skin)
        soundEffectsCheckbox.isChecked = game.preferences.isSoundEffectsEnabled()
        soundEffectsCheckbox.addListener {
            val enabled = soundEffectsCheckbox.isChecked
            game.preferences.setMusicEnabled(enabled)
            false
        }

        // return to main screen button
        val backButton = TextButton("Back",skin,"small") // the extra argument here "small" is used to set the button to the smaller version instead of the big default version

        backButton.addListener(object : ChangeListener() {
            override fun changed(event: ChangeEvent, actor: Actor) {
                game.setScreen<MenuScreen>()
            }
        })

        table.defaults().pad(10f)
        table.add(titleLabel).colspan(2)
        table.row();
        table.add(volumeMusicLabel).left()
        table.add(volumeMusicSlider);
        table.row();
        table.add(musicOnOffLabel).left()
        table.add(musicCheckbox);
        table.row();
        table.add(volumeSoundLabel).left()
        table.add(soundMusicSlider);
        table.row();
        table.add(soundOnOffLabel).left()
        table.add(soundEffectsCheckbox);
        table.row();
        table.add(backButton).colspan(2)
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
