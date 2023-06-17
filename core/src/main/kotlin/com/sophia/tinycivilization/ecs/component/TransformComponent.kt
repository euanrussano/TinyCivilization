package com.sophia.tinycivilization.ecs.component

import com.badlogic.ashley.core.Component
import com.badlogic.gdx.math.Vector2

import com.badlogic.gdx.math.Vector3




class TransformComponent : Component {
    val position = Vector3()
    val scale = Vector2(1.0f, 1.0f)
    var rotation = 0.0f
    var isHidden = false

}
