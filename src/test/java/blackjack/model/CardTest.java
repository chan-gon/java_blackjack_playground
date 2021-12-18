package blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardTest {

    @Test
    void 카드_생성_테스트() {
        Card card = new Card("10", Card.SPADE);
        assertThat(card.getCard(card.getNumber(), card.getSuit())).isEqualTo("10스페이드");
    }
}