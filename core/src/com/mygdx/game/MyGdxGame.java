package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import entities.Ship;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sprite sprite;
	Ship myShip;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("triangle.png");
		sprite = new Sprite(img);
		myShip = new Ship(0, 0, 0, 10, 300);
		sprite.setRotation(myShip.getRotation());
		sprite.setPosition(myShip.getX(), myShip.getY());
	}
	
	
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		myShip.update();
		sprite.setPosition(myShip.getX(), myShip.getY());
		sprite.setRotation(myShip.getRotation());
		
		batch.begin();
		sprite.draw(batch);
		batch.end();
	}
}
