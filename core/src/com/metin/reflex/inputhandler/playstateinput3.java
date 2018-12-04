package com.metin.reflex.inputhandler;

import com.badlogic.gdx.InputProcessor;
import com.metin.reflex.state.menustate;
import com.metin.reflex.state.playstate2;
import com.metin.reflex.state.playstate3;

/**
 * Created by orhan on 15.04.2018.
 */

public class playstateinput3 implements InputProcessor {
    playstate3 ps3;



    public playstateinput3(playstate3 ps){
        this.ps3 = ps;
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
        if(ps3.getGeri().getButtonRect().contains(screenX,screenY)) {
            ps3.getSound2().stop();
            ps3.getSm3().pushState(new menustate(ps3.getSm3()));}
        if(ps3.getDeger()==ps3.getDeger2()){
            int a= ps3.getSkor();
            a=a+1;
            ps3.setSkor(a);

        }
        else
        {
            int c=ps3.getCan();
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

            ps3.setCan(c);
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
