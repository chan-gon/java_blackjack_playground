package blackjack.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CardsTest {

    @Test
    void getCardsSumTest() {
        ArrayList<Card> cardsSet = new ArrayList<>();
        cardsSet.add(new Card("2", Card.Suit.다이아몬드));
        cardsSet.add(new Card("3", Card.Suit.다이아몬드));
        cardsSet.add(new Card("4", Card.Suit.다이아몬드));

        Cards cards = new Cards(cardsSet);
        assertThat(cards.getCardsSum()).isEqualTo(9);
    }

    @Test
    void getCardPointNumberTest() {
        ArrayList<Card> cardsSet = new ArrayList<>();
        cardsSet.add(new Card("K", Card.Suit.다이아몬드));
        cardsSet.add(new Card("Q", Card.Suit.다이아몬드));
        cardsSet.add(new Card("J", Card.Suit.다이아몬드));
        cardsSet.add(new Card("A", Card.Suit.다이아몬드));

        Cards cards = new Cards(cardsSet);
        assertThat(cards.getCardPointNumber(cards.getCardsList().get(0).getNumber())).isEqualTo(10);
        assertThat(cards.getCardPointNumber(cards.getCardsList().get(1).getNumber())).isEqualTo(10);
        assertThat(cards.getCardPointNumber(cards.getCardsList().get(2).getNumber())).isEqualTo(10);
        assertThat(cards.getCardPointNumber(cards.getCardsList().get(3).getNumber())).isEqualTo(11);
    }
}
