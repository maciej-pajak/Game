package com.yolo.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.yolo.game.MyFirstGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Let the boy live";
		config.width = 1000;
		config.height = 800;
		
		new LwjglApplication(new MyFirstGame(), config);
	}
}
