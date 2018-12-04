package com.metin.reflex.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.metin.reflex.gameobject.Buton;
import com.metin.reflex.imageloader.imageloader;
import com.metin.reflex.inputhandler.playstateinput2;

import java.util.Date;
import java.util.Random;


/**
 * Created by orhan on 14.04.2018.
 */

public class playstate2 extends state{

    private Buton geri;
    private String[] toppings = {"A", "B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U","V","W","X","Y","Z"};
    private int deger=0,can;
    private int a;
    Random rnd ;
    Date now ;
    Date now1 ;
    long ilkzaman;
    private int skor;
    private Sound sound2 = Gdx.audio.newSound(Gdx.files.internal("psm.mp3"));
    private statemanager sm2;
    Preferences prefs = Gdx.app.getPreferences("My Preferences");


    public playstate2(statemanager sm2) {
        super(sm2);
        this.sm2=sm2;
        geri = new Buton((float) (Gdx.graphics.getWidth()/35), (float) (Gdx.graphics.getHeight()/10*8.50),Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()/8,imageloader.geriReg);

        can=5;
        skor =0;
        rnd = new Random();
        deger = rnd.nextInt(25);
        a = rnd.nextInt(25);

        rnd = new Random();
        now1 = new Date();


        ilkzaman =  (now1.getTime()+1000);
        Gdx.input.setInputProcessor(new playstateinput2(this));
        skor =  prefs.getInteger("hs1");
        sound2.play(1.0f);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);

        sb.begin();

        sb.draw(imageloader.ps2Reg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

        imageloader.font.draw(sb,Integer.toString(skor) , Gdx.graphics.getWidth()/4,Gdx.graphics.getHeight()/100);
        imageloader.font.draw(sb, toppings[a] , Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/80);
        imageloader.font.draw(sb,toppings[deger] , Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
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




            ilkzaman =  (now.getTime()+100*5);
        }


        if(skor==20)
        {
            if(prefs.getInteger("hs")<skor){
                prefs.putInteger("hs", skor);
            }

            prefs.putInteger("hs2", skor);
            sound2.stop();
            getSm2().pushState(new playstate3(getSm2()));

        }
        if (can==0)
        {
            sound2.stop();
            getSm2().pushState(new gameoverstate(getSm2()));
        }
        if(prefs.getInteger("hs")<skor){
            prefs.putInteger("hs", skor);
        }

        prefs.putInteger("hs2", skor);
        prefs.flush();


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

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public statemanager getSm2() {
        return sm2;
    }

    public void setSm2(statemanager sm2) {
        this.sm2 = sm2;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }


    public Buton getGeri() {
        return geri;
    }

    public void setGeri(Buton geri) {
        this.geri = geri;
    }

    public Sound getSound2() {
        return sound2;
    }

    public void setSound2(Sound sound2) {

        this.sound2 = sound2;
    }
}