package com.syberkeep.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.syberkeep.game.Bamboo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Bamboo.WIDTH;
		config.height = Bamboo.HEIGHT;
		config.title = Bamboo.TITLE;
		new LwjglApplication(new Bamboo(), config);
	}
}
