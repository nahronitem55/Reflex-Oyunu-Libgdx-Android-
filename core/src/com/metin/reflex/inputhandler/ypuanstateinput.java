package com.metin.reflex.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.metin.reflex.state.menustate;
import com.metin.reflex.state.playstate;
import com.metin.reflex.state.playstate2;
import com.metin.reflex.state.ypuanstate;

/**
 * Created by orhan on 08.05.2018.
 */

public class ypuanstateinput implements InputProcessor    {
    ypuanstate yps;



    public ypuanstateinput(ypuanstate ps) {
        this.yps=ps;
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

        if(yps.getGeri().getButtonRect().contains(screenX,screenY)) {
            yps.getSound().stop();
            yps.getSmy().pushState(new menustate(yps.getSmy()));
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
