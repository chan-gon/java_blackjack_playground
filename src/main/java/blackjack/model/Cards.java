package blackjack.model;

import java.util.ArrayList;
import java.util.Collections;

public class Cards {
    private static final int MIN_CARD_NUM = 2;
    private static final int MAX_CARD_NUM = 10;
    private static final int BLACKJACK_NUM = 21;
    private static final int KING_QUEEN_JACK_NUM = 10;

    private final ArrayList<Card> cards;
    private int cardsSum;

    public Cards(ArrayList<Card> cards) {
        this.cards = cards;
        this.cardsSum = 0;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public ArrayList<Card> getCardsList() {
        return cards;
    }

    public static ArrayList<Card> setCards() {
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = MIN_CARD_NUM; i < MAX_CARD_NUM; i++) {
            for (Card.Suit suit : Card.Suit.values()) {
                cards.add(new Card(String.valueOf(i), suit));
            }
        }

        for (Card.Suit suit : Card.Suit.values()) {
            cards.add(new Card("K", suit));
            cards.add(new Card("Q", suit));
            cards.add(new Card("J", suit));
            cards.add(new Card("A", suit));
        }

        Collections.shuffle(cards);
        return cards;
    }

    public void addCard(ArrayList<Card> cardSet) {
        cards.add(cardSet.remove(0));
    }

    public int getCardsSum() {
        cardsSum = 0;
        for (int i = 0; i < cards.size(); i++) {
            cardsSum += getCardPointNumber(cards.get(i).getNumber());
        }
        return cardsSum;
    }

    public int getCardPointNumber(String number) {
        if (number.equals("K") || number.equals("Q") || number.equals("J")) {
            return KING_QUEEN_JACK_NUM;
        }
        if (number.equals("A")) {
            return processAce();
        }
        return Integer.parseInt(number);
    }

    private int processAce() {
        if (cardsSum + 11 <= BLACKJACK_NUM) {
            return 11;
        }
        return 1;
    }

}
