package blackjack.controller;

import blackjack.view.InputView;

import java.util.Scanner;

public class BlackJackController {

    public void startGame() {
        InputView inputView = new InputView(new Scanner(System.in));
        String[] names = inputView.askPlayerNames().split(",");
        for (int i = 0; i < names.length; i++) {
            String betAmount = inputView.askBetAmount(names[i]);
            System.out.println(betAmount);
        }
    }
}
