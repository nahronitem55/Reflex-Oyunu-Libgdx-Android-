package com.metin.reflex.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by orhan on 06.05.2018.
 */

public class Buton implements gameobject{

    private TextureRegion buttonImage;
    private float xKord,yKord,width,height;
    private Rectangle buttonRect;
    //private  TextureRegion textureRegion;

    public Buton(float xKord,float yKord,float width,float height, TextureRegion textureRegion){
        this.xKord=xKord;
        this.yKord=yKord;
        this.width=width;
        this.height=height;
        this.buttonImage=textureRegion;

        buttonRect = new Rectangle(xKord,yKord,width,height);
    }
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(buttonImage,xKord,yKord,width,height);
        sb.end();

    }

    public void update(float delta) {

    }

    public Rectangle getButtonRect(){
        return buttonRect;
    }
}
