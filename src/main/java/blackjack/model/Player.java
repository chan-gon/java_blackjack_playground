package blackjack.model;

import java.util.ArrayList;

public class Player {

    private String name;
    private final Cards playerCards;
    private int cardsSum;
    private int bettingMoney;

    public Player(String name) {
        this.name = name;
        this.playerCards = new Cards(new ArrayList<>());
        this.bettingMoney = 0;
    }

    public String getName() {
        return name;
    }

    public Cards getPlayerCards() {
        return playerCards;
    }

    public int getCardsSum() {
        return cardsSum;
    }

    public int calculateCardsSum() {
        cardsSum = playerCards.getCardsSum();
        return cardsSum;
    }

    public int getBettingMoney() {
        return bettingMoney;
    }

    public void setBettingMoney(int bettingMoney) {
        this.bettingMoney = bettingMoney;
    }

    public int calculateBettingMoney(int dealerCardSum) {
        cardsSum = playerCards.getCardsSum();
        if (dealerCardSum > Rule.BLACKJACK_NUM.getNumber()) {
            return -bettingMoney;
        }
        if (dealerCardSum == Rule.BLACKJACK_NUM.getNumber() && cardsSum == Rule.BLACKJACK_NUM.getNumber()) {
            int dealerMoney = bettingMoney;
            bettingMoney = 0;
            return dealerMoney;
        }
        if (cardsSum > Rule.BLACKJACK_NUM.getNumber()) {
            int dealerMoney = bettingMoney;
            bettingMoney = -bettingMoney;
            return dealerMoney;
        }
        if (cardsSum < dealerCardSum) {
            int dealerMoney = bettingMoney;
            bettingMoney = -bettingMoney;
            return dealerMoney;
        }
        return -bettingMoney;
    }
}
