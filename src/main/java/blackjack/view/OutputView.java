package blackjack.view;

import blackjack.model.Player;

import java.util.ArrayList;

public class OutputView {

    public static void playerCard(Player player) {
        StringBuilder sb = new StringBuilder();
        sb.append(player.getName()).append("카드: ");
        for (int i = 0; i < player.getPlayerCards().getCardsList().size(); i++) {
            sb.append(player.getPlayerCards().getCardsList().get(i).getCardName());
            sb = addComma(i, player, sb);
        }
        System.out.println(sb.toString());
    }

    private static StringBuilder addComma(int i, Player player, StringBuilder sb) {
        if (i != player.getPlayerCards().getCardsList().size() - 1) {
            sb.append(", ");
        }
        return sb;
    }

    public static void playersResult(ArrayList<Player> players) {
        for (int i = 0; i < players.size(); i++) {
            onePlayerResult(players.get(i));
        }
        System.out.println();
    }

    private static void onePlayerResult(Player player) {
        StringBuilder sb = new StringBuilder();
        sb.append(player.getName()).append("카드: ");
        for (int i = 0; i < player.getPlayerCards().getCardsList().size(); i++) {
            sb.append(player.getPlayerCards().getCardsList().get(i).getCardName());
            sb = addComma(i, player, sb);
        }
        sb.append(" - 결과: ").append(player.getPlayerCards().getCardsSum());
        System.out.println(sb.toString());
    }

    public static void finalProfit(ArrayList<Player> players) {
        System.out.println("## 최종 수익");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < players.size(); i++) {
            sb.append(players.get(i).getName()).append(": ").append(players.get(i).getBettingMoney()).append("\n");
        }
        System.out.println(sb.toString());
    }
}
