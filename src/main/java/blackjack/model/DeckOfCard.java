package blackjack.model;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCard {

    private static final String SUITS[] = {"스페이드", "하트", "다이아몬드", "클로버"};
    private static final String RANKS[] = {"A", "K", "Q", "J", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static final int NUM_OF_SHUFFLE = 2;
    private final ArrayList<Card> cards;

    public DeckOfCard() {
        cards = new ArrayList<Card>();
        for (int i = 0; i < NUM_OF_SHUFFLE; i++) {
            for (int j = 0; j < NUM_OF_SHUFFLE; j++) {
                this.cards.add(new Card(RANKS[j], SUITS[i]));
            }
        }
        Collections.shuffle(this.cards);

    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
