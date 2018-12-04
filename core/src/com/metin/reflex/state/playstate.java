package com.metin.reflex.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.metin.reflex.gameobject.Buton;
import com.metin.reflex.imageloader.imageloader;
import com.metin.reflex.inputhandler.playstateinput;

import java.util.Date;
import java.util.Random;

/**
 * Created by orhan on 14.04.2018.
 */

public class playstate extends state {
    private Buton geri;
    private int a;
    private int skor,can;
    Random rnd ;
    Date now ;
    Date now1 ;
    long ilkzaman;
    private int deger;

    private Sound sound2 = Gdx.audio.newSound(Gdx.files.internal("psm.mp3"));
    private statemanager sm;
    Preferences prefs = Gdx.app.getPreferences("My Preferences");

    public playstate(statemanager sm) {
        super(sm);
        geri = new Buton((float) (Gdx.graphics.getWidth()/35), (float) (Gdx.graphics.getHeight()/10*8.50),Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()/8,imageloader.geriReg);

        this.sm=sm;
        skor =0;
        can=5;
        rnd = new Random();
        now1 = new Date();
        a = 1+rnd.nextInt(10);
        deger = 1+rnd.nextInt(10);
        ilkzaman =  (now1.getTime()+1000);
        Gdx.input.setInputProcessor(new playstateinput(this));

        sound2.play(1.0f);

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);

        sb.begin();
        sb.draw(imageloader.ps1Reg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        imageloader.font.draw(sb,Integer.toString(a) , Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/80);
        imageloader.font.draw(sb,Integer.toString(skor) , Gdx.graphics.getWidth()/4,Gdx.graphics.getHeight()/100);
        imageloader.font.draw(sb,Integer.toString(deger) , Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
        imageloader.font.draw(sb,Integer.toString(can) , Gdx.graphics.getWidth()/6,Gdx.graphics.getHeight()/2);


        sb.end();
        geri.render(sb);

    }

    @Override
    public void update(float delta) {
        now = new Date();
            System.out.println(now.getTime()-ilkzaman);

        if(now.getTime()-ilkzaman>0){
            deger = a;


            if(skor==10)
            {
                prefs.putInteger("hs1", skor);
                if(prefs.getInteger("hs")<skor){
                    prefs.putInteger("hs", skor);
                }
                sound2.stop();
                getSm().pushState(new playstate2(getSm()));

            }
            if (can==0)
            {
                sound2.stop();
                getSm().pushState(new gameoverstate(getSm()));

            }

            ilkzaman =  (now.getTime()+300);
        }

            prefs.putInteger("hs1", skor);

        if(prefs.getInteger("hs")<skor){
            prefs.putInteger("hs", skor);
        }


        prefs.flush();

    }

    public Buton getGeri() {
        return geri;
    }

    public void setGeri(Buton geri) {
        this.geri = geri;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getDeger() {
        return deger;
    }

    public void setDeger(int deger) {
        this.deger = deger;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }
    public statemanager getSm() {
        return sm;
    }

    public void setSm(statemanager sm) {
        this.sm = sm;
    }

    public Sound getSound2() {
        return sound2;
    }

    public void setSound(Sound sound2) {
        this.sound2 = sound2;
    }
}
