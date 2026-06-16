package com.thedorcode.learn_katanga_framework;

import com.thedorcode.learn_katanga_framework.game.GameRunner;
import com.thedorcode.learn_katanga_framework.game.SuperContraGame;


public class AppGamingJava {

	public static void main(String[] args) {
		
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
