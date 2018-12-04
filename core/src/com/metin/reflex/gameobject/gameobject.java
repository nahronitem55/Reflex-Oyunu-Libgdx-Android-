package com.metin.reflex.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by orhan on 06.05.2018.
 */

public interface gameobject {

    public  void render(SpriteBatch sb);

    public void update(float delta);
}
