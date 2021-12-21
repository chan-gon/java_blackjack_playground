package blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    @Test
    void getCardNameTest() {
        Card card = new Card(Card.Suit.하트,"7");
        assertThat(card.getCardName()).isEqualTo("하트7");
    }

    @Test
    void getNumberTest() {
        Card card = new Card(Card.Suit.하트,"7");
        assertThat(card.getNumber()).isEqualTo("7");
    }
}
