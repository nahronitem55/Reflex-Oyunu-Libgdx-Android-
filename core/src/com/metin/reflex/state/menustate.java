package com.metin.reflex.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.metin.reflex.gameobject.Buton;
import com.metin.reflex.imageloader.imageloader;
import com.metin.reflex.inputhandler.menustateinput;
import com.metin.reflex.inputhandler.playstateinput;

/**
 * Created by orhan on 06.05.2018.
 */

public class menustate extends state {
    private Buton basla,ypuan,nasil,cikis;

    private statemanager sm;
    private Sound sound = Gdx.audio.newSound(Gdx.files.internal("msm.mp3"));

    public menustate(statemanager sm){
        super(sm);
        this.sm = sm;
        nasil = new Buton((float) (Gdx.graphics.getWidth()/14), (float) (Gdx.graphics.getHeight()/10*1.50),Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/6,imageloader.nasilReg);
        basla = new Buton((float)(Gdx.graphics.getWidth()/1.58), (float) (Gdx.graphics.getHeight()/10*1.50), Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/6,imageloader.baslaReg);
        ypuan = new Buton((float)(Gdx.graphics.getWidth()/1.58), (float) (Gdx.graphics.getHeight()/10*4.50), Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/6,imageloader.ypuanReg);
        cikis = new Buton((float)(Gdx.graphics.getWidth()/1.58), (float) (Gdx.graphics.getHeight()/10*7.50), Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/6,imageloader.cikisReg);
        Gdx.input.setInputProcessor(new menustateinput(this));

         // play new sound and keep handle for further manipulation

        sound.play(1.0f);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();

        sb.draw(imageloader.arkaplanReg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        //  sb.draw(ImageLoader.yem,50,50,Gdx.graphics.getWidth()/15,Gdx.graphics.getWidth()/15);


        sb.end();
        basla.render(sb);
        ypuan.render(sb);
        nasil.render(sb);
        cikis.render(sb);
    }

    @Override
    public void update(float delta) {


    }

    public Buton getBasla() {
        return basla;
    }

    public void setBasla(Buton basla) {
        this.basla = basla;
    }

    public Buton getYpuan() {
        return ypuan;
    }

    public void setYpuan(Buton ypuan) {
        this.ypuan = ypuan;
    }

    public Buton getNasil() {
        return nasil;
    }

    public void setNasil(Buton nasil) {
        this.nasil = nasil;
    }

    public Buton getCikis() {
        return cikis;
    }

    public void setCikis(Buton cikis) {
        this.cikis = cikis;
    }

    public statemanager getSm() {
        return sm;
    }

    public void setSm(statemanager sm) {
        this.sm = sm;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }
}
