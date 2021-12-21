package blackjack.model;

public enum Rule {
    MIN_CARD_NUM(2),
    MAX_CARD_NUM(10),
    BLACKJACK_NUM(21),
    KING_QUEEN_JACK_NUM(10);

    private final int number;

    Rule(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
