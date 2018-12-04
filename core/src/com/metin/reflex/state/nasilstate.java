package com.metin.reflex.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.metin.reflex.gameobject.Buton;
import com.metin.reflex.imageloader.imageloader;
import com.metin.reflex.inputhandler.gameoverstateinput;
import com.metin.reflex.inputhandler.nasilinputstate;
import com.metin.reflex.inputhandler.playstateinput;

/**
 * Created by orhan on 09.05.2018.
 */

public class nasilstate extends state {
    private Buton geri;
    private Sound sound = Gdx.audio.newSound(Gdx.files.internal("msm.mp3"));
    private statemanager smn;
    public nasilstate(statemanager smn) {
        super(smn);
        this.smn=smn;

        geri = new Buton((float) (Gdx.graphics.getWidth()/55), (float) (Gdx.graphics.getHeight()/10*8.45),Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()/8, imageloader.geriReg);
        Gdx.input.setInputProcessor(new nasilinputstate(this));
        sound.play(1.0f);
    }

    @Override
    public void render(SpriteBatch sb) {

        sb.setProjectionMatrix(camera.combined);
        sb.begin();


        sb.draw(imageloader.nasiloyReg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());


        sb.end();
        geri.render(sb);



    }

    @Override
    public void update(float delta) {

    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public Buton getGeri() {
        return geri;
    }

    public void setGeri(Buton geri) {
        this.geri = geri;
    }

    public statemanager getSmn() {
        return smn;
    }

    public void setSmn(statemanager smn) {
        this.smn = smn;
    }
}
