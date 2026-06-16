package com.thedorcode.learn_katanga_framework.game;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

@ExtendWith(OutputCaptureExtension.class)
class BatmanGameTest {

	@Test
	void allActionsPrintExpectedMessages(CapturedOutput output) {
		var batmanGame = new BatmanGame();

		batmanGame.up();
		batmanGame.down();
		batmanGame.left();
		batmanGame.right();

		assertThat(output)
				.contains("Mata")
				.contains("Kita")
				.contains("mopanzi ya muasi")
				.contains("mopanzi ya mukulima");
	}

}
