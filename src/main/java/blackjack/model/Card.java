package blackjack.model;

public class Card {
    public static final String SPADE = "스페이드";
    public static final String HEART = "하트";
    public static final String DIAMOND = "다이아몬드";
    public static final String CLOVER = "클로버";

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
