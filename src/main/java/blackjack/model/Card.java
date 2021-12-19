package blackjack.model;

public class Card {
    public static final String SPADE = "스페이드";
    public static final String HEART = "하트";
    public static final String DIAMOND = "다이아몬드";
    public static final String CLOVER = "클로버";

    private String number;
    private String suit;

    public Card(String number, String suit) {
        number = checkLetter(number);
        this.number = number;
        this.suit = suit;
    }

    private String checkLetter(String number) {
        for (Letter letter : Letter.values()) {
            if (number == letter.getLetterName()) {
                number = letter.getLetterNumber();
            }
        }
        return number;
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
