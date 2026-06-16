package com.thedorcode.learn_katanga_framework.game;

public class GameRunner {

	private GamingConsole _game;
	
	public GameRunner(GamingConsole game) {
		_game = game;
	}

	public GameRunner(MarioGame game) {
        //TODO Auto-generated constructor stub
    }

    public void run() {
		System.out.println("Running game: " + _game);
		_game.up();
		_game.down();
		_game.left();
		_game.right();
	}

}
