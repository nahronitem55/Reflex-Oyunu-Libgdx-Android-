package com.metin.reflex;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.metin.reflex.imageloader.imageloader;
import com.metin.reflex.state.menustate;
import com.metin.reflex.state.statemanager;

public class mainclass extends Game {


	private SpriteBatch sb;

	private static statemanager sm;
	public void create() {
		//Oyun açıldığında ilk iş resimleri sesleri yüklemek olacak
		imageloader.Load();

		sm= new statemanager();
		sm.pushState(new menustate(sm));
		sb= new SpriteBatch();


	}

	//oluşturulan seyler kullanılarak çizilir
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		sm.render(sb);
		sm.update(Gdx.graphics.getDeltaTime());

	}
	
	@Override
	public void dispose () {
		imageloader.dispose();
	}
}
