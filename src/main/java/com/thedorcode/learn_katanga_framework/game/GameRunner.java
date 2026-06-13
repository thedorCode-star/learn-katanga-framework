package com.thedorcode.learn_katanga_framework.game;

public class GameRunner {
	MarioGame _game;
	
	public GameRunner(MarioGame game) {
		_game = game;
	}

	public void run() {
		System.out.println("Running game: " + _game);
		_game.up();
		_game.down();
		_game.left();
		_game.right();
	}

}
