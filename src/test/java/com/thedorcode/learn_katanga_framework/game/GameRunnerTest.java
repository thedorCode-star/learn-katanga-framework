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
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);

		// Act
		gameRunner.run();

		// Assert
		assertThat(output).contains("Running game:");
	}

	@Test
	void runPrintsAllGameActions(CapturedOutput output) {
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);

		gameRunner.run();

		assertThat(output)
				.contains("up super contra")
				.contains("down super contra")
				.contains("left super contra")
				.contains("shoot a bullet super contra");
	}

}
