package com.sophia.tinycivilization.model

import com.badlogic.ashley.core.Entity
import com.badlogic.ashley.core.PooledEngine
import com.sophia.tinycivilization.ecs.component.TerrainComponent
import com.sophia.tinycivilization.ecs.component.TransformComponent

class GameFactory {



    fun createGame() : PooledEngine{

        val engine = PooledEngine()

        createWorld(engine)

        return engine


    }

    private fun createWorld(engine: PooledEngine) {

        val grass = TerrainComponent().also { it.name = "Grass" }
        val water = TerrainComponent().also { it.name = "Shallow Water" }

        for (x in 0 until 10) {
            for (y in 0 until 10) {
                val tile = Entity()
                tile.add(TransformComponent().apply { position.x = x.toFloat(); position.y=y.toFloat() })
                if (y == 5){
                    tile.add(water)
                } else {
                    tile.add(grass)
                }
                engine.addEntity(tile)
            }
        }

    }

}