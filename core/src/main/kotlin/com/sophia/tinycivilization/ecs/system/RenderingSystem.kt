package com.sophia.tinycivilization.ecs.system

import com.badlogic.ashley.core.Entity
import com.badlogic.ashley.core.Family
import com.badlogic.ashley.systems.SortedIteratingSystem
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.viewport.Viewport
import com.sophia.tinycivilization.ecs.component.TextureComponent
import com.sophia.tinycivilization.ecs.component.TransformComponent
import ktx.ashley.mapperFor
import ktx.graphics.use


class RenderingSystem(val batch: SpriteBatch, val viewport: Viewport) :
    SortedIteratingSystem(
        Family.all(TransformComponent::class.java, TextureComponent::class.java).get(),
        ZComparator()
    ) {

    override fun update(deltaTime: Float) {
        viewport.apply()
        batch.projectionMatrix = viewport.camera.combined
        batch.use {
            super.update(deltaTime)
        }
    }
    override fun processEntity(entity: Entity?, deltaTime: Float) {
        val tex: TextureComponent = mapperFor<TextureComponent>().get(entity)
        val t: TransformComponent = mapperFor<TransformComponent>().get(entity)

        if (tex.region == null || t.isHidden) {
            return;
        }

        val width = tex.region!!.regionWidth.toFloat()
        val height = tex.region!!.regionHeight.toFloat()

        val originX = width / 2f
        val originY = height / 2f

        batch.draw(
            tex.region,
            t.position.x - originX, t.position.y - originY,
            originX, originY,
            width, height,
            1f, 1f,
            t.rotation
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