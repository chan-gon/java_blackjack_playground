package blackjack.model;

public class Card {

    private final String number;
    private final String suit;

    public Card(String number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public String getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }

}
