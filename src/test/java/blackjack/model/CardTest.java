package blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardTest {

    @Test
    void 카드_생성_테스트() {
        Card card1 = new Card("10", Suit.SPADE.getSuitName());
        assertThat(card1.getCard()).isEqualTo("10스페이드");
        Card card2 = new Card("2", Suit.HEART.getSuitName());
        assertThat(card2.getCard()).isEqualTo("2하트");
        Card card3 = new Card("7", Suit.CLOVER.getSuitName());
        assertThat(card3.getCard()).isEqualTo("7클로버");
        Card card4 = new Card(Letter.KING.getLetterName(), Suit.CLOVER.getSuitName());
        assertThat(card4.getCard()).isEqualTo("K클로버");
        Card card5 = new Card(Letter.ACE.getLetterName(), Suit.SPADE.getSuitName());
        assertThat(card5.getCard()).isEqualTo("A스페이드");
    }

}