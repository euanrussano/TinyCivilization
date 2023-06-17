package com.sophia.tinycivilization.asset

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion


class Assets {

    val manager = AssetManager()
    val textures = mutableMapOf<String, TextureRegion>()

    val grassTileSheetName = "Grass.png"
    val shoreTileSheetName = "Shore.png"

    fun queueAddImages() {
        manager.load<Texture>(grassTileSheetName, Texture::class.java)
        manager.load<Texture>(shoreTileSheetName, Texture::class.java)

    }

    fun queueAddFonts() {

    }

    fun queueAddParticleEffects() {

    }

    fun setupAssets(){

        val grassTileSheet = TextureRegion(manager.get(grassTileSheetName, Texture::class.java)).split(16, 16)
        val shoreTileSheet = TextureRegion(manager.get(shoreTileSheetName, Texture::class.java)).split(16, 16)
        textures["Grass"] = grassTileSheet[0][1]
        textures["Shallow Water"] = shoreTileSheet[0][2]
    }

    fun getTexture(textureName : String) : TextureRegion{
        return textures[textureName]!!
    }

    fun queueAddSounds() {

    }

    fun queueAddMusic() {

    }


}
