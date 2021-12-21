package blackjack.model;

public class Card {
    public enum Suit {
        스페이드, 하트, 클로버, 다이아몬드
    }

    private final String number;
    private final Suit suit;

    public Card(String number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public String getCardName() {
        return number + suit;
    }

    public String getNumber() {
        return number;
    }

}
