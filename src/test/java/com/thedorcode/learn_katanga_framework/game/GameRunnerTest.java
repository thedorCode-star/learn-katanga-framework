package com.thedorcode.learn_katanga_framework.game;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(OutputCaptureExtension.class)
class GameRunnerTest {

	@Test
	void runPrintsRunningGameMessage(CapturedOutput output) {
		// Arrange
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);

		// Act
		gameRunner.run();

		// Assert
		assertThat(output).contains("Running game:");
	}

	@Test
	void runPrintsAllGameActions(CapturedOutput output) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);

		gameRunner.run();

		assertThat(output)
				.contains("Jump")
				.contains("Crouch")
				.contains("Move left")
				.contains("Move right");
	}

}
