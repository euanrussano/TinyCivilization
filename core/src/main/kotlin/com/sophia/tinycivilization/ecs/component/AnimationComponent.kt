package com.sophia.tinycivilization.ecs.component

import com.badlogic.ashley.core.Component
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.IntMap




class AnimationComponent : Component {
    var animations: IntMap<Animation<TextureRegion>> = IntMap<Animation<TextureRegion>>()

}