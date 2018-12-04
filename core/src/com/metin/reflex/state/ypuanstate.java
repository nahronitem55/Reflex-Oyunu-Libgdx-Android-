package com.metin.reflex.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.metin.reflex.gameobject.Buton;
import com.metin.reflex.imageloader.imageloader;
import com.metin.reflex.inputhandler.playstateinput;
import com.metin.reflex.inputhandler.ypuanstateinput;
import com.metin.reflex.state.state;
import com.metin.reflex.state.statemanager;

/**
 * Created by orhan on 08.05.2018.
 */

public class ypuanstate extends state {
    Preferences prefs = Gdx.app.getPreferences("My Preferences");
    int hs;
    private Buton geri;

    private Sound sound = Gdx.audio.newSound(Gdx.files.internal("msm.mp3"));
    private statemanager smy;
    public ypuanstate(statemanager smy) {
        super(smy);
        this.smy=smy;
        geri = new Buton((float) (Gdx.graphics.getWidth()/55), (float) (Gdx.graphics.getHeight()/10*8.70),Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()/8,imageloader.geriReg);



        hs =prefs.getInteger("hs");
        Gdx.input.setInputProcessor(new ypuanstateinput(this));
        sound.play(1.0f);

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();


        sb.draw(imageloader.YPSReg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

        imageloader.font.draw(sb,Integer.toString(hs) , Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);

        sb.end();
        geri.render(sb);

    }



    @Override
    public void update(float delta) {









    }

    public Buton getGeri() {
        return geri;
    }

    public void setGeri(Buton geri) {
        this.geri = geri;
    }

    public statemanager getSmy() {
        return smy;
    }

    public void setSmy(statemanager smy) {
        this.smy = smy;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }
}
