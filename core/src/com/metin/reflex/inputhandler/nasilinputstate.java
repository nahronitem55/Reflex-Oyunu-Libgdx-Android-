package com.metin.reflex.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.metin.reflex.state.menustate;
import com.metin.reflex.state.nasilstate;
import com.metin.reflex.state.state;

/**
 * Created by orhan on 09.05.2018.
 */

public class nasilinputstate implements InputProcessor {

    nasilstate ns;
    public nasilinputstate(state nasilstate) {
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {

        if(ns.getGeri().getButtonRect().contains(screenX,screenY)) {
            ns.getSound().stop();
            ns.getSmn().pushState(new menustate(ns.getSmn()));
        }
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
