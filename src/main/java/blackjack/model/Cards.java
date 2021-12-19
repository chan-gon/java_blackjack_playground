package blackjack.model;

import java.util.List;

public class Cards {

    private final List<Card> cards;

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public int calculateCardNum() {
        return cards.stream()
                .mapToInt(Card::getNumber)
                .sum();
    }
}
