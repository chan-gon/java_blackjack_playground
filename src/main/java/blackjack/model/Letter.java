package blackjack.model;

public enum Letter {
    ACE("A", "1"),
    KING("K", "10"),
    QUEEN("Q", "10"),
    JACK("J", "10");

    private final String letterName;
    private final String letterNumber;

    Letter(String letterName, String letterNumber) {
        this.letterName = letterName;
        this.letterNumber = letterNumber;
    }

    public String getLetterNumber() {
        return letterNumber;
    }

    public String getLetterName() {
        return letterName;
    }
}
