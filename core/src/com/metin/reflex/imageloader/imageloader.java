package com.metin.reflex.imageloader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by orhan on 14.04.2018.
 */

public class imageloader {

    public static Texture akrep,arı,at,ayı,balık,bizon,böcek,cita,dalmacyalı,deve,essek,fare,geyik,golden,horoz,inek,istakoz,kanguru,karga,kartal,kedi,kelebek,kirpi,kurbaga,kurtkopek,kus,okuz,sinek,suaygırı,tavuk,timsah,yarasa,yengec,yunus,zurafa;

    public static TextureRegion akrepReg,arıReg,atReg,ayıReg,balıkReg,bizonReg,böcekReg,citaReg,dalmacyalıReg,deveReg,essekReg,fareReg,geyikReg,goldenReg,horozReg,inekReg,istakozReg,kanguruReg,kargaReg,kartalReg,kediReg,kelebekReg,kirpiReg,kurbagaReg,kurtkopekReg,kusReg,okuzReg,sinekReg,suaygırıReg,tavukReg,timsahReg,yarasaReg,yengecReg,yunusReg,zurafaReg;

    public static Texture basla ,ypuan,nasil,cikis,arkaplan,geri,ps1,ps2,ps3,YPS,gov,nasiloy;
    public static TextureRegion baslaReg,ypuanReg,nasilReg,cikisReg,arkaplanReg,geriReg,ps1Reg,ps2Reg,ps3Reg,YPSReg,govReg,nasiloyReg;
    public static BitmapFont font;
    public  static Texture fontTexture;
    public static void Load(){
        font = new BitmapFont(Gdx.files.internal("font.fnt"),true);
        //font.getData().setScale((float) 2);
        font.getData().setScale(2f, 2f);
        fontTexture = new Texture(Gdx.files.internal("font.png"));

        fontTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

        arkaplan = new Texture(Gdx.files.internal("arkaplan.png"));
        arkaplanReg =new TextureRegion(arkaplan,0,0,arkaplan.getWidth(),arkaplan.getHeight());
        arkaplanReg.flip(false,true);

        ps1 = new Texture(Gdx.files.internal("ps1.png"));
        ps1Reg =new TextureRegion(ps1,0,0,ps1.getWidth(),ps1.getHeight());
        ps1Reg.flip(false,true);

        ps2 = new Texture(Gdx.files.internal("ps2.png"));
        ps2Reg =new TextureRegion(ps2,0,0,ps2.getWidth(),ps2.getHeight());
        ps2Reg.flip(false,true);

        ps3 = new Texture(Gdx.files.internal("ps3.png"));
        ps3Reg =new TextureRegion(ps3,0,0,ps3.getWidth(),ps3.getHeight());
        ps3Reg.flip(false,true);

        YPS = new Texture(Gdx.files.internal("YPS.png"));
        YPSReg =new TextureRegion(YPS,0,0,YPS.getWidth(),YPS.getHeight());
        YPSReg.flip(false,true);

        gov = new Texture(Gdx.files.internal("gov.png"));
        govReg =new TextureRegion(gov,0,0,gov.getWidth(),gov.getHeight());
        govReg.flip(false,true);

        nasiloy = new Texture(Gdx.files.internal("nasiloy.png"));
        nasiloyReg =new TextureRegion(nasiloy,0,0,nasiloy.getWidth(),nasiloy.getHeight());
        nasiloyReg.flip(false,true);




        basla = new Texture(Gdx.files.internal("basla.png"));
        baslaReg =new TextureRegion(basla,0,0,basla.getWidth(),basla.getHeight());
        baslaReg.flip(false,true);

        nasil = new Texture(Gdx.files.internal("nasil.png"));
        nasilReg =new TextureRegion(nasil,0,0,nasil.getWidth(),nasil.getHeight());
        nasilReg.flip(false,true);

        ypuan = new Texture(Gdx.files.internal("ypuan.png"));
        ypuanReg =new TextureRegion(ypuan,0,0,ypuan.getWidth(),ypuan.getHeight());
        ypuanReg.flip(false,true);

        cikis = new Texture(Gdx.files.internal("cikis.png"));
        cikisReg =new TextureRegion(cikis,0,0,cikis.getWidth(),cikis.getHeight());
        cikisReg.flip(false,true);

        geri = new Texture(Gdx.files.internal("geri.png"));
        geriReg =new TextureRegion(geri,0,0,geri.getWidth(),geri.getHeight());
        geriReg =new TextureRegion(geri,0,0,geri.getWidth(),geri.getHeight());
        geriReg.flip(false,true);



        akrep = new Texture(Gdx.files.internal("akrep.png"));
        akrepReg =new TextureRegion(akrep,0,0,akrep.getWidth(),akrep.getHeight());
        akrepReg.flip(false,true);

        arı = new Texture(Gdx.files.internal("arı.png"));
        arıReg =new TextureRegion(arı,0,0,arı.getWidth(),arı.getHeight());
        arıReg.flip(false,true);

        at = new Texture(Gdx.files.internal("at.png"));
        atReg =new TextureRegion(at,0,0,at.getWidth(),at.getHeight());
        atReg.flip(false,true);

        ayı = new Texture(Gdx.files.internal("ayı.png"));
        ayıReg =new TextureRegion(ayı,0,0,ayı.getWidth(),ayı.getHeight());
        ayıReg.flip(false,true);

        balık = new Texture(Gdx.files.internal("balık.png"));
        balıkReg =new TextureRegion(balık,0,0,balık.getWidth(),balık.getHeight());
        balıkReg.flip(false,true);

        bizon = new Texture(Gdx.files.internal("bizon.png"));
        bizonReg =new TextureRegion(bizon,0,0,bizon.getWidth(),bizon.getHeight());
        bizonReg.flip(false,true);

        böcek = new Texture(Gdx.files.internal("böcek.png"));
        böcekReg =new TextureRegion(böcek,0,0,böcek.getWidth(),böcek.getHeight());
        böcekReg.flip(false,true);

        kedi = new Texture(Gdx.files.internal("cita.png"));
        kediReg =new TextureRegion(kedi,0,0,kedi.getWidth(),kedi.getHeight());
        kediReg.flip(false,true);

        dalmacyalı = new Texture(Gdx.files.internal("dalmacyalı.png"));
        dalmacyalıReg =new TextureRegion(dalmacyalı,0,0,dalmacyalı.getWidth(),dalmacyalı.getHeight());
        dalmacyalıReg.flip(false,true);


        deve = new Texture(Gdx.files.internal("deve.png"));
        deveReg =new TextureRegion(deve,0,0,deve.getWidth(),deve.getHeight());
        deveReg.flip(false,true);

        essek = new Texture(Gdx.files.internal("essek.png"));
        essekReg =new TextureRegion(essek,0,0,essek.getWidth(),essek.getHeight());
        essekReg.flip(false,true);

        fare = new Texture(Gdx.files.internal("fare.png"));
        fareReg =new TextureRegion(fare,0,0,fare.getWidth(),fare.getHeight());
        fareReg.flip(false,true);

        geyik = new Texture(Gdx.files.internal("geyik.png"));
        geyikReg =new TextureRegion(geyik,0,0,geyik.getWidth(),geyik.getHeight());
        geyikReg.flip(false,true);

        golden = new Texture(Gdx.files.internal("golden.png"));
        goldenReg =new TextureRegion(golden,0,0,golden.getWidth(),golden.getHeight());
        goldenReg.flip(false,true);

        horoz = new Texture(Gdx.files.internal("horoz.png"));
        horozReg =new TextureRegion(horoz,0,0,horoz.getWidth(),horoz.getHeight());
        horozReg.flip(false,true);

        inek = new Texture(Gdx.files.internal("inek.png"));
        inekReg =new TextureRegion(inek,0,0,inek.getWidth(),inek.getHeight());
        inekReg.flip(false,true);

        istakoz = new Texture(Gdx.files.internal("istakoz.png"));
        istakozReg =new TextureRegion(istakoz,0,0,istakoz.getWidth(),istakoz.getHeight());
        istakozReg.flip(false,true);


        kanguru = new Texture(Gdx.files.internal("kanguru.png"));
        kanguruReg =new TextureRegion(kanguru,0,0,kanguru.getWidth(),kanguru.getHeight());
        kanguruReg.flip(false,true);

        karga = new Texture(Gdx.files.internal("karga.png"));
        kargaReg =new TextureRegion(karga,0,0,karga.getWidth(),karga.getHeight());
        kargaReg.flip(false,true);

        kartal = new Texture(Gdx.files.internal("kartal.png"));
        kartalReg =new TextureRegion(kartal,0,0,kartal.getWidth(),kartal.getHeight());
        kartalReg.flip(false,true);

        kedi = new Texture(Gdx.files.internal("kedi.png"));
        kediReg =new TextureRegion(kedi,0,0,kedi.getWidth(),kedi.getHeight());
        kediReg.flip(false,true);

        kelebek = new Texture(Gdx.files.internal("kelebek.png"));
        kelebekReg =new TextureRegion(kelebek,0,0,kelebek.getWidth(),kelebek.getHeight());
        kelebekReg.flip(false,true);


        kirpi = new Texture(Gdx.files.internal("kirpi.png"));
        kirpiReg =new TextureRegion(kirpi,0,0,kirpi.getWidth(),kirpi.getHeight());
        kirpiReg.flip(false,true);


        kurbaga = new Texture(Gdx.files.internal("kurbaga.png"));
        kurbagaReg =new TextureRegion(kurbaga,0,0,kurbaga.getWidth(),kurbaga.getHeight());
        kurbagaReg.flip(false,true);

        kurtkopek = new Texture(Gdx.files.internal("kurtkopek.png"));
        kurtkopekReg =new TextureRegion(kurtkopek,0,0,kurtkopek.getWidth(),kurtkopek.getHeight());
        kurtkopekReg.flip(false,true);

        kus = new Texture(Gdx.files.internal("kus.png"));
        kusReg =new TextureRegion(kus,0,0,kus.getWidth(),kus.getHeight());
        kusReg.flip(false,true);

        okuz = new Texture(Gdx.files.internal("okuz.png"));
        okuzReg =new TextureRegion(okuz,0,0,okuz.getWidth(),okuz.getHeight());
        okuzReg.flip(false,true);

        sinek = new Texture(Gdx.files.internal("sinek.png"));
        sinekReg =new TextureRegion(sinek,0,0,sinek.getWidth(),sinek.getHeight());
        sinekReg.flip(false,true);

        suaygırı = new Texture(Gdx.files.internal("suaygırı.png"));
        suaygırıReg =new TextureRegion(suaygırı,0,0,suaygırı.getWidth(),suaygırı.getHeight());
        suaygırıReg.flip(true,false);

        tavuk = new Texture(Gdx.files.internal("tavuk.png"));
        tavukReg =new TextureRegion(tavuk,0,0,tavuk.getWidth(),tavuk.getHeight());
        tavukReg.flip(false,true);

        timsah = new Texture(Gdx.files.internal("timsah.png"));
        timsahReg =new TextureRegion(timsah,0,0,timsah.getWidth(),timsah.getHeight());
        timsahReg.flip(false,true);

        yarasa = new Texture(Gdx.files.internal("yarasa.png"));
        yarasaReg =new TextureRegion(yarasa,0,0,yarasa.getWidth(),yarasa.getHeight());
        yarasaReg.flip(false,true);

        yengec = new Texture(Gdx.files.internal("yengec.png"));
        yengecReg =new TextureRegion(yengec,0,0,yengec.getWidth(),yengec.getHeight());
        yengecReg.flip(false,true);

        yunus = new Texture(Gdx.files.internal("yunus.png"));
        yunusReg =new TextureRegion(yunus,0,0,yunus.getWidth(),yunus.getHeight());
        yunusReg.flip(false,true);

        zurafa = new Texture(Gdx.files.internal("zurafa.png"));
        zurafaReg =new TextureRegion(zurafa,0,0,zurafa.getWidth(),zurafa.getHeight());
        zurafaReg.flip(false,true);


    }

    public static void dispose(){



    }

    public static void zurafaReg(SpriteBatch sb, String s, int i, int i1) {

    }
}
