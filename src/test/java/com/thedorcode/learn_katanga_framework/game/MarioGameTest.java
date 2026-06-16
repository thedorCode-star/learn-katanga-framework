package com.thedorcode.learn_katanga_framework.game;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

@ExtendWith(OutputCaptureExtension.class)
class MarioGameTest {

	@Test
	void allActionsPrintExpectedMessages(CapturedOutput output) {
		var marioGame = new MarioGame();

		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();

		assertThat(output)
				.contains("Jump")
				.contains("Crouch")
				.contains("Move left")
				.contains("Move right");
	}

}
