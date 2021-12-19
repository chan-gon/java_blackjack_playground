package blackjack.model;

public enum Letter {
    ACE("A", 1),
    KING("K", 10),
    QUEEN("Q", 10),
    JACK("J", 10);

    private final String letterName;
    private final int letterNumber;

    Letter(String letterName, int letterNumber) {
        this.letterName = letterName;
        this.letterNumber = letterNumber;
    }

    public int getValue() {
        return letterNumber;
    }

    public int getLetterNumber() {
        return letterNumber;
    }
}
