package com.metin.reflex.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.metin.reflex.state.gameoverstate;
import com.metin.reflex.state.menustate;
import com.metin.reflex.state.state;

/**
 * Created by orhan on 09.05.2018.
 */

public class gameoverstateinput implements InputProcessor {
    gameoverstate gs;

    public gameoverstateinput(state gameoverstate) {

    }


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
        if(gs.getGeri().getButtonRect().contains(screenX,screenY)) {
            gs.getSound().stop();
            gs.getSmg().pushState(new menustate(gs.getSmg()));
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
