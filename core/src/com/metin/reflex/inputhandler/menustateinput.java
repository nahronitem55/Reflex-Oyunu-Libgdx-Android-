package com.metin.reflex.inputhandler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.metin.reflex.state.*;

/**
 * Created by orhan on 06.05.2018.
 */

public class menustateinput implements InputProcessor {
    menustate ms;

    public menustateinput(menustate ms) {
        this.ms = ms;

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
        if (ms.getBasla().getButtonRect().contains(screenX, screenY)) {
            ms.getSound().stop();
            ms.getSm().pushState(new playstate(ms.getSm()));

        }
        if (ms.getCikis().getButtonRect().contains(screenX, screenY)) {
            Gdx.app.exit();
        }

        if (ms.getYpuan().getButtonRect().contains(screenX, screenY)) {
            ms.getSound().stop();
            ms.getSm().pushState(new com.metin.reflex.state.ypuanstate(ms.getSm()));
        }

        if (ms.getNasil().getButtonRect().contains(screenX, screenY)) {
            ms.getSound().stop();
            ms.getSm().pushState(new com.metin.reflex.state.nasilstate(ms.getSm()));
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
