package blackjack.view;

import blackjack.model.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputView {

    public static String playerName() throws IOException {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static String inputBettingMoney(String playerName) throws IOException {
        System.out.println(playerName + "의 배팅 금액은?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static void splitTwoCards(ArrayList<Player> players) {
        System.out.println();
        String dealer = "딜러";
        dealer += "와";
        for (int i = 1; i < players.size(); i++) {
            dealer += players.get(i).getName();
            if (i != players.size() - 1) {
                dealer += ", ";
            }
        }
        dealer += "에게 2장을 나누었습니다.";
        dealer += "\n";
        System.out.println(dealer);
    }

    public static void playersTwoCards(ArrayList<Player> players) {
        System.out.println("딜러: " + players.get(0).getPlayerCards().getCardsList().get(0).getCardName());
        for (int i = 1; i < players.size(); i++) {
            Player player = players.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(player.getName() + "카드: ").append(player.getPlayerCards().getCardsList().get(0).getCardName());
            System.out.println(sb.toString());
        }
        System.out.println();
    }

    public static String playerOneMoreCard(Player player) throws IOException {
        System.out.println(player.getName() + "은 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ask = br.readLine();
        return ask;
    }

    public static void dealerOneMoreCard() {
        System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
        System.out.println();
    }
}
