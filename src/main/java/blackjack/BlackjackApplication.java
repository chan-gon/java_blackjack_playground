package blackjack;

import blackjack.controller.GameController;
import blackjack.model.Cards;
import blackjack.model.Players;
import blackjack.view.InputView;

import java.io.IOException;

public class BlackjackApplication {
    public static void main(String[] args) throws IOException {
        Players players = new Players(GameController.setPlayerName(InputView.playerName()));
        Cards cards = new Cards(Cards.setCards());

        GameController.setPlayersBettingMoney(players);
        GameController.giveTwoCards(cards, players);
        GameController.checkPlayersTwoCardsSum(players);
        GameController.askPlayersOneMoreCard(cards, players);
        GameController.getDealerOneMoreCard(cards, players);
        GameController.showPlayersResults(players);
        GameController.checkPlayersProfit(players);
    }
}
