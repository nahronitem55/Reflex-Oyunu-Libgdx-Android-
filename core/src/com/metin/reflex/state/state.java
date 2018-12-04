package com.metin.reflex.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by orhan on 14.04.2018.
 */

public abstract class state {

    protected OrthographicCamera camera;

    public state(statemanager sm){

        camera = new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());


    }



    public abstract void render(SpriteBatch sb);
    public abstract void update(float delta);

}
