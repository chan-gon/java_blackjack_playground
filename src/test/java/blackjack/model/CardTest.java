package blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    @Test
    void getCardNameTest() {
        Card card = new Card("7",Card.Suit.하트);
        assertThat(card.getCardName()).isEqualTo("7하트");
    }

    @Test
    void getNumberTest() {
        Card card = new Card("7",Card.Suit.하트);
        assertThat(card.getNumber()).isEqualTo("7");
    }
}
