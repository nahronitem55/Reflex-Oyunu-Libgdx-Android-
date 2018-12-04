package com.metin.reflex.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.metin.reflex.gameobject.Buton;
import com.metin.reflex.imageloader.imageloader;
import com.metin.reflex.inputhandler.playstateinput3;

import java.util.Date;
import java.util.Random;

/**
 * Created by orhan on 29.04.2018.
 */

public class playstate3 extends state {

    //private String[] toppings = {"akrepReg","arıReg","atReg","ayıReg","balıkReg","bizonReg","böcekReg","citaReg","dalmacyalıReg","deveReg","essekReg","fareReg","geyikReg","goldenReg","horozReg","inekReg","istakozReg","kanguruReg","kargaReg","kartalReg","kediReg","kelebekReg","kirpiReg","kurbagaReg","kurtkopekReg","kusReg","okuzReg","sinekReg","suaygırıReg","tavukReg","timsahReg","yarasaReg","yengecReg","yunusReg","zurafaReg"};
    private int deger,hız=0,deger2;
    private Buton geri;
    Random rnd ;
    private int a;
    private int skor,can;
    Date now ;
    Date now1 ;
    long ilkzaman;
    private Sound sound2 = Gdx.audio.newSound(Gdx.files.internal("psm.mp3"));
    private statemanager sm3;
    Preferences prefs = Gdx.app.getPreferences("My Preferences");

    public playstate3(statemanager sm3) {
        super(sm3);
        this.sm3=sm3;
        rnd = new Random();
        geri = new Buton((float) (Gdx.graphics.getWidth()/35), (float) (Gdx.graphics.getHeight()/10*8.50),Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()/8,imageloader.geriReg);

        skor =0;
        can=5;



        now1 = new Date();



        ilkzaman =  (now1.getTime()+1000);
        Gdx.input.setInputProcessor(new playstateinput3(this));
        skor =  prefs.getInteger("hs2");
        sound2.play(1.0f);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();

        sb.draw(imageloader.ps3Reg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        imageloader.font.draw(sb,Integer.toString(deger2) , Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/80);
        imageloader.font.draw(sb,Integer.toString(skor) , Gdx.graphics.getWidth()/4,Gdx.graphics.getHeight()/100);
        imageloader.font.draw(sb,Integer.toString(deger) , Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
        imageloader.font.draw(sb,Integer.toString(can) , Gdx.graphics.getWidth()/6,Gdx.graphics.getHeight()/2);
        switch(deger) {
            case 0:
                System.out.println("önlem");
            case 1:sb.draw(imageloader.akrepReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/2, Gdx.graphics.getWidth()/2);break;
            case 2:sb.draw(imageloader.arıReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/2, Gdx.graphics.getWidth()/2);break;
            case 3:sb.draw(imageloader.atReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/2, Gdx.graphics.getWidth()/2);break;
            case 4:sb.draw(imageloader.ayıReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/2, Gdx.graphics.getWidth()/2);break;
            case 5:sb.draw(imageloader.balıkReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/2, Gdx.graphics.getWidth()/2);break;
            case 6:sb.draw(imageloader.bizonReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/2, Gdx.graphics.getWidth()/2);break;
            case 8:
                System.out.println("önlem3");break;
            case 9:sb.draw(imageloader.dalmacyalıReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/2);break;
            case 10:sb.draw(imageloader.deveReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 11:sb.draw(imageloader.essekReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 12:sb.draw(imageloader.fareReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 13:sb.draw(imageloader.geyikReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 14:sb.draw(imageloader.goldenReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 15:sb.draw(imageloader.horozReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 16:sb.draw(imageloader.inekReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 17:sb.draw(imageloader.istakozReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 18:sb.draw(imageloader.kanguruReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 19:sb.draw(imageloader.kargaReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 20:sb.draw(imageloader.kartalReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 21:sb.draw(imageloader.kediReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 22:sb.draw(imageloader.horozReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 23:sb.draw(imageloader.kelebekReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 24:sb.draw(imageloader.kirpiReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 25:sb.draw(imageloader.kurbagaReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 26:sb.draw(imageloader.kurtkopekReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 27:sb.draw(imageloader.kusReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 28:sb.draw(imageloader.sinekReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 29:sb.draw(imageloader.suaygırı, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 30:sb.draw(imageloader.tavukReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 31:sb.draw(imageloader.timsahReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 32:sb.draw(imageloader.yarasaReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 33:sb.draw(imageloader.yengecReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 34:sb.draw(imageloader.yunusReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 35:sb.draw(imageloader.zurafaReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 36:
                System.out.println("önlem2");
        }

        switch(deger2) {
            case 0:
                System.out.println("önlem");
            case 1:sb.draw(imageloader.akrepReg, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/80, Gdx.graphics.getWidth()/80);
            case 2:sb.draw(imageloader.arıReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 3:sb.draw(imageloader.atReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 1, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 4:sb.draw(imageloader.ayıReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 5:sb.draw(imageloader.balıkReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 6:sb.draw(imageloader.bizonReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 7:sb.draw(imageloader.böcekReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 8: System.out.println("önlem3");break;
            case 9:sb.draw(imageloader.dalmacyalıReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 10:sb.draw(imageloader.deveReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 11:sb.draw(imageloader.essekReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 12:sb.draw(imageloader.fareReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 13:sb.draw(imageloader.geyikReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 14:sb.draw(imageloader.goldenReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 15:sb.draw(imageloader.horozReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 16:sb.draw(imageloader.inekReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 17:sb.draw(imageloader.istakozReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 18:sb.draw(imageloader.kanguruReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 19:sb.draw(imageloader.kargaReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 20:sb.draw(imageloader.kartalReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 21:sb.draw(imageloader.kediReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 22:sb.draw(imageloader.horozReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 23:sb.draw(imageloader.kelebekReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 24:sb.draw(imageloader.kirpiReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 25:sb.draw(imageloader.kurbagaReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 26:sb.draw(imageloader.kurtkopekReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 27:sb.draw(imageloader.kusReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 28:sb.draw(imageloader.sinekReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 29:sb.draw(imageloader.suaygırı, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 30:sb.draw(imageloader.tavukReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 31:sb.draw(imageloader.timsahReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 32:sb.draw(imageloader.yarasaReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 33:sb.draw(imageloader.yengecReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 34:sb.draw(imageloader.yunusReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 35:sb.draw(imageloader.zurafaReg, Gdx.graphics.getWidth() / 5, Gdx.graphics.getHeight() / 2, Gdx.graphics.getWidth()/5, Gdx.graphics.getWidth()/5);break;
            case 36:
                System.out.println("önlem2");
        }


        sb.end();
        geri.render(sb);

    }

    @Override
    public void update(float delta) {



        now = new Date();
        System.out.println(now.getTime()-ilkzaman);

        if(now.getTime()-ilkzaman>0){
            deger2 = 1+rnd.nextInt(35);

            ilkzaman =  (now.getTime()+100*5);
        }
        if(skor==30)
        {
            prefs.putInteger("hs3", skor);
            if(prefs.getInteger("hs")<skor){
                prefs.putInteger("hs", skor);

            }
            sound2.stop();
            getSm3().pushState(new menustate(getSm3()));

        }
        if (can==0)
        {
            sound2.stop();
            getSm3().pushState(new gameoverstate(getSm3()));
        }
        if(prefs.getInteger("hs")<skor){
            prefs.putInteger("hs", skor);
        }

        prefs.putInteger("hs3", skor);
        prefs.flush();

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

    public int getDeger2() {
        return deger2;
    }

    public void setDeger2(int deger2) {
        this.deger2 = deger2;
    }

    public statemanager getSm3() {
        return sm3;
    }

    public void setSm3(statemanager sm3) {
        this.sm3 = sm3;
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
