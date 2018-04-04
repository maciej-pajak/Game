package com.yolo.game.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Player extends Sprite {
	/**
	 * Movement vevtore velocity
	 */
	private Vector2 velocity = new Vector2();
	private float speed = 60 * 3;
	private float gravity = 60 * 5;
	
	public Player(Sprite sprite) {
		super(sprite);
	}
	
	
	@Override
	public void draw(Batch batch) {
		update(Gdx.graphics.getDeltaTime());
		super.draw(batch);
	}
	
	public void update(Float delta) {
		
	}
}
