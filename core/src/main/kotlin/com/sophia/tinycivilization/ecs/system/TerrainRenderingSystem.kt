package com.sophia.tinycivilization.ecs.system

import com.badlogic.ashley.core.Entity
import com.badlogic.ashley.core.Family
import com.badlogic.ashley.systems.SortedIteratingSystem
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.viewport.FitViewport
import com.badlogic.gdx.utils.viewport.Viewport
import com.sophia.tinycivilization.asset.Assets
import com.sophia.tinycivilization.ecs.component.TerrainComponent
import com.sophia.tinycivilization.ecs.component.TextureComponent
import com.sophia.tinycivilization.ecs.component.TransformComponent
import ktx.ashley.mapperFor
import ktx.assets.toInternalFile
import ktx.graphics.use


class TerrainRenderingSystem(val assets : Assets, val batch: SpriteBatch, val viewport: Viewport) :
    SortedIteratingSystem(
        Family.all(TerrainComponent::class.java, TransformComponent::class.java).get(),
        ZComparator()
    ) {

    private val textures = mutableMapOf<String, TextureRegion>()


    init {
    }

    override fun update(deltaTime: Float) {
        viewport.apply()
        batch.projectionMatrix = viewport.camera.combined
        batch.use {
            super.update(deltaTime)
        }
    }
    override fun processEntity(entity: Entity?, deltaTime: Float) {
        val terrainComponent: TerrainComponent = mapperFor<TerrainComponent>().get(entity)
        val transform: TransformComponent = mapperFor<TransformComponent>().get(entity)


        val originX = 1 / 2f
        val originY = 1 / 2f

        batch.draw(
            assets.getTexture(terrainComponent.name),
            transform.position.x - originX, transform.position.y - originY,
            originX, originY,
            1f, 1f,
            1f, 1f,
            transform.rotation
        )
    }

    class ZComparator : Comparator<Entity> {
        override fun compare(p0: Entity?, p1: Entity?): Int {
            val az: Float = mapperFor<TransformComponent>().get(p0).position.z
            val bz: Float =  mapperFor<TransformComponent>().get(p1).position.z
            var res = 0
            if (az > bz) {
                res = 1
            } else if (az < bz) {
                res = -1
            }
            return res
        }

    }
}