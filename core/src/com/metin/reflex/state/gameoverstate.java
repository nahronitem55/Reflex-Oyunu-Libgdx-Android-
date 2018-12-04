package com.metin.reflex.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.metin.reflex.gameobject.Buton;
import com.metin.reflex.imageloader.imageloader;
import com.metin.reflex.inputhandler.gameoverstateinput;
import com.metin.reflex.inputhandler.playstateinput;
import com.metin.reflex.inputhandler.ypuanstateinput;

/**
 * Created by orhan on 09.05.2018.
 */

public class gameoverstate extends state {
    Preferences prefs = Gdx.app.getPreferences("My Preferences");
    int hs;
    private Buton geri;

    private Sound sound = Gdx.audio.newSound(Gdx.files.internal("msm.mp3"));
    private statemanager smg;

    public gameoverstate(statemanager smg) {
        super(smg);
        this.smg=smg;



        geri = new Buton((float) (Gdx.graphics.getWidth()/55), (float) (Gdx.graphics.getHeight()/10*8.45),Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()/8, imageloader.geriReg);



        hs =prefs.getInteger("hs");
        Gdx.input.setInputProcessor(new gameoverstateinput(this));
        sound.play(1.0f);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();


        sb.draw(imageloader.govReg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

        imageloader.font.draw(sb,Integer.toString(hs) , Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);

        sb.end();
        geri.render(sb);


    }

    @Override
    public void update(float delta) {



    }


    public void setSmg(statemanager smg) {
        this.smg = smg;
    }

    public statemanager getSmg() {
        return smg;
    }

    public Buton getGeri() {
        return geri;
    }

    public void setGeri(Buton geri) {
        this.geri = geri;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public Preferences getPrefs() {
        return prefs;
    }

    public void setPrefs(Preferences prefs) {
        this.prefs = prefs;
    }

    public int getHs() {
        return hs;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }
}
