package blackjack.model;

import blackjack.utils.RandomUtil;

import java.util.List;

public class Cards {

    private final List<Card> cards;

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public int calculateCardNum() {
        return cards.stream()
                .map(Card::getNumber)
                .map(number -> convertNameToNumber(number))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private String convertNameToNumber(String number) {
        for (Letter letter : Letter.values()) {
            if (number.equals(letter.getLetterName())) {
                number = letter.getLetterNumber();
            }
        }
        return number;
    }

}
