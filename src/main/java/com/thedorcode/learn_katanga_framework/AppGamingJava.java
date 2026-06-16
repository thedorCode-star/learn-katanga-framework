package com.thedorcode.learn_katanga_framework;

import com.thedorcode.learn_katanga_framework.game.GameRunner;
import com.thedorcode.learn_katanga_framework.game.MarioGame;


public class AppGamingJava {

	public static void main(String[] args) {
		
		var game = new MarioGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
