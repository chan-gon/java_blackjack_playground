package blackjack.model;

public class Card {
    public enum Suit {
        스페이드, 하트, 클로버, 다이아몬드
    }

    private final Suit suit;
    private final String number;

    public Card(Suit suit, String number) {
        this.suit = suit;
        this.number = number;
    }

    public String getCardName() {
        return suit + number;
    }

    public String getNumber() {
        return number;
    }

}
