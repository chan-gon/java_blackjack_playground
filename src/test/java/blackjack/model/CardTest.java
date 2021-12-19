package blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CardTest {

    @Test
    void 카드_생성_테스트() {
        Card card1 = new Card(10, Card.SPADE);
        assertThat(card1.getCard()).isEqualTo("10스페이드");
        Card card2 = new Card(2, Card.HEART);
        assertThat(card2.getCard()).isEqualTo("2하트");
        Card card3 = new Card(7, Card.CLOVER);
        assertThat(card3.getCard()).isEqualTo("7클로버");
    }

    @Test
    void 카드_생성_숫자_범위_테스트() {
        assertThatThrownBy(() -> new Card(11, Card.CLOVER))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Card(1, Card.CLOVER))
                .isInstanceOf(IllegalArgumentException.class);
    }
}