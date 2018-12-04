package com.metin.reflex.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.metin.reflex.state.menustate;
import com.metin.reflex.state.playstate;
import com.metin.reflex.state.playstate2;
import com.metin.reflex.state.playstate3;

/**
 * Created by orhan on 15.04.2018.
 */

public class playstateinput2 implements InputProcessor {

    playstate2 ps2;
    public playstateinput2(playstate2 ps2){
        this.ps2 = ps2;
    }


    public playstateinput2(playstate3 ps){
        this.ps2 = ps2;
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
        if(ps2.getGeri().getButtonRect().contains(screenX,screenY)) {
            ps2.getSound2().stop();
            ps2.getSm2().pushState(new menustate(ps2.getSm2()));}
        if(ps2.getA()==ps2.getDeger()){
            int a= ps2.getSkor();
            a=a+1;
            ps2.setSkor(a);

        }
        else
        {
            int c=ps2.getCan();
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

            ps2.setCan(c);
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
