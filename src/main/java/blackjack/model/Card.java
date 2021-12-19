package blackjack.model;

public class Card {
    public static final String SPADE = "스페이드";
    public static final String HEART = "하트";
    public static final String DIAMOND = "다이아몬드";
    public static final String CLOVER = "클로버";
    public static final int MIN_NUM_RANGE = 2;
    public static final int MAX_NUM_RANGE = 10;

    private int number;
    private String suit;

    public Card(int number, String suit) {
        checkNumRange(number);
        this.number = number;
        this.suit = suit;
    }

    private void checkNumRange(int number) {
        if (number > MAX_NUM_RANGE || number < MIN_NUM_RANGE) {
            throw new IllegalArgumentException("카드 숫자는 2 ~ 10 사이의 숫자만 가능합니다.");
        }
    }

    public int getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }

    public String getCard() {
        return number + suit;
    }
}
