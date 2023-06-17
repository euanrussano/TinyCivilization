package com.sophia.tinycivilization.controller

import com.badlogic.gdx.InputProcessor
import com.badlogic.gdx.math.Vector2




class KeyboardController : InputProcessor {


    var isMouse1Down = false
    var isMouse2Down = false
    var isMouse3Down = false
    var isDragged = false
    val mouseLocation: Vector2 = Vector2()
    val mouseScrolled = Vector2()

    override fun keyDown(keycode: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun keyUp(keycode: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun keyTyped(character: Char): Boolean {
        TODO("Not yet implemented")
    }

    override fun touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
        when (button) {
            0 -> {
                isMouse1Down = true;
            }
            1 -> {
                isMouse2Down = true;
            }
            2 -> {
                isMouse3Down = true;
            }
        }
        mouseLocation.x = screenX.toFloat();
        mouseLocation.y = screenY.toFloat();
        return false;
    }

    override fun touchUp(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
        isDragged = false;
        //System.out.println(button);
        when (button) {
            0 -> {
                isMouse1Down = false;
            }
            1 -> {
                isMouse2Down = false;
            }
            2 -> {
                isMouse3Down = false;
            }
        }
        mouseLocation.x = screenX.toFloat();
        mouseLocation.y = screenY.toFloat();
        return false;
    }

    override fun touchDragged(screenX: Int, screenY: Int, pointer: Int): Boolean {
        isDragged = true;
        mouseLocation.x = screenX.toFloat();
        mouseLocation.y = screenY.toFloat();
        return false;
    }

    override fun mouseMoved(screenX: Int, screenY: Int): Boolean {
        mouseLocation.x = screenX.toFloat();
        mouseLocation.y = screenY.toFloat();
        return false;
    }

    override fun scrolled(amountX: Float, amountY: Float): Boolean {
        mouseScrolled.x = amountX.toFloat()
        mouseScrolled.y = amountY.toFloat()
        return false
    }
}