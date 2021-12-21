package blackjack.model;

import java.util.ArrayList;

public class Players {

    private final ArrayList<Player> players;

    public Players(ArrayList<Player> players) {
        this.players = players;
    }

    public void getTwoCards(Cards cardSet) {
        for (Player player : players) {
            player.getPlayerCards().addCard(cardSet.getCardsList());
            player.getPlayerCards().addCard(cardSet.getCardsList());
        }
    }

    public void addOneMoreCard(Cards cardSet, int i) {
        players.get(i).getPlayerCards().addCard(cardSet.getCardsList());
    }

    public boolean isOneMoreCardNeed(Cards cardSet) {
        Player dealer = players.get(0);
        if (dealer.getPlayerCards().getCardsSum() <= Rule.MIN_CARD_SUM_NUM.getNumber()) {
            dealer.getPlayerCards().addCard(cardSet.getCardsList());
            return true;
        }
        return false;
    }

    public int getPlayersSize() {
        return players.size();
    }

    public void setPlayerBettingMoney(int idx, int bettingMoney) {
        players.get(idx).setBettingMoney(bettingMoney);
    }

    public String getPlayerName(int idx) {
        return players.get(idx).getName();
    }

    public int checkPlayerCardsSum(int idx) {
        return players.get(idx).calculateCardsSum();
    }

    public void checkPlayerBlackJack(int dealerCardSum, int idx) {
        int dealerMoney = players.get(idx).checkBlackJackFirst(dealerCardSum);
        players.get(0).addDealerProfit(dealerMoney);
    }
}
