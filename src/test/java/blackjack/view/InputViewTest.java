package blackjack.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputViewTest {

    private String playerName;

    @BeforeEach
    void setUp() {
        InputView inputView = new InputView(new Scanner("pobi"));
        playerName = inputView.askPlayerNames();
    }

    @Test
    void 게임_참여자_입력_테스트() {
        InputView inputView = new InputView(new Scanner("pobi,jason"));
        assertThat(inputView.askPlayerNames()).isEqualTo("pobi,jason");
    }

    @Test
    void 배팅금액_입력_테스트() {
        InputView inputView2 = new InputView(new Scanner("10000"));
        assertThat(inputView2.askBetAmount(playerName)).isEqualTo("10000");
    }

    @Test
    void 카드_한장더받겠다_입력_테스트() {
        InputView inputView = new InputView(new Scanner("y"));
        assertThat(inputView.askExtraCard(playerName)).isEqualTo("y");
    }

    @Test
    void 카드_한장더받겠다_입력_오류_테스트() {
        InputView inputView = new InputView(new Scanner("yyy"));

        assertThatThrownBy(() -> inputView.askExtraCard(playerName))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 배팅금액_입력_오류_테스트() {
        InputView inputView = new InputView(new Scanner("abcdefg"));

        assertThatThrownBy(() -> inputView.askBetAmount(playerName))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 공백_입력_오류_테스트() {
        assertThatThrownBy(() -> new InputView(new Scanner("")))
                .isInstanceOf(NoSuchElementException.class);
    }
}
