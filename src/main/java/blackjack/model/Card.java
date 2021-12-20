package blackjack.model;

public class Card {

    private String number;
    private String suit;

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

    public String getCard() {
        return number + suit;
    }
}
