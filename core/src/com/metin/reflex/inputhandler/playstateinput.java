package com.metin.reflex.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.metin.reflex.state.gameoverstate;
import com.metin.reflex.state.menustate;
import com.metin.reflex.state.nasilstate;
import com.metin.reflex.state.playstate;
import com.metin.reflex.state.playstate2;

/**
 * Created by orhan on 15.04.2018.
 */

public class playstateinput implements InputProcessor {
    playstate ps;
    public playstateinput(playstate ps){
        this.ps = ps;
    }

    public playstateinput(gameoverstate playstate2) {

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
        if(ps.getGeri().getButtonRect().contains(screenX,screenY)) {
            ps.getSound2().stop();
            ps.getSm().pushState(new menustate(ps.getSm()));
        }
        if(ps.getA()==ps.getDeger()){
            int a= ps.getSkor();
            a=a+1;
            ps.setSkor(a);

        }
        else
        {
            int c=ps.getCan();
            if(c==5)
            {
                c--;
            }
            else if(c==4)
            {
                c--;
            }
            else if(c==3)
            {
                c--;
            }
            else if(c==2)
            {
                c--;
            }
            else if(c==1)
            {
                c--;
            }
            else if(c==0)
            {
                c=0;
            }

            ps.setCan(c);
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
