package blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardTest {

    @Test
    void 카드_생성_테스트() {
        Card card1 = new Card("10", Card.SPADE);
        assertThat(card1.getCard()).isEqualTo("10스페이드");
        Card card2 = new Card("2", Card.HEART);
        assertThat(card2.getCard()).isEqualTo("2하트");
        Card card3 = new Card("7", Card.CLOVER);
        assertThat(card3.getCard()).isEqualTo("7클로버");
        Card card4 = new Card(Letter.KING.getLetterName(), Card.CLOVER);
        assertThat(card4.getCard()).isEqualTo("K클로버");
        Card card5 = new Card(Letter.ACE.getLetterName(), Card.SPADE);
        assertThat(card5.getCard()).isEqualTo("A스페이드");
    }

}