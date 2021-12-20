package blackjack.view;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputView {

    private static final String EMPTY_CHECK_MSG = "공백을 입력할 수 없습니다.";
    private static final String ANSWER_CHECK_MSG = "y 또는 n만 입력 가능합니다.";
    private static final String BET_CHECK_MSG = "배팅 금액은 숫자만 입력 가능합니다.";
    private static final String ANSWER_YES = "y";
    private static final String ANSWER_NO = "n";
    private static final String REGEX = "[0-9]+";
    private static Scanner scanner = new Scanner(System.in);

    public InputView(Scanner scanner) {
        checkEmptyInput(scanner);
        this.scanner = scanner;
    }

    public InputView() {
    }

    public String askPlayerNames() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String participants = scanner.nextLine();
        return participants;
    }

    public String askBetAmount(String playerName) {
        System.out.println(playerName + "의 배팅 금액은?");
        String betAmount = scanner.nextLine();
        checkBetAmount(betAmount);
        return betAmount;
    }

    public String askExtraCard(String playerName) {
        System.out.println(playerName + "는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
        String answer = scanner.nextLine().trim().toLowerCase();
        checkAnswer(answer);
        return answer;
    }

    private void checkEmptyInput(Scanner scanner) {
        if (!scanner.hasNext()) {
            throw new NoSuchElementException(EMPTY_CHECK_MSG);
        }
    }

    private void checkBetAmount(String betAmount) {
        if (!betAmount.matches(REGEX)) {
            throw new IllegalArgumentException(BET_CHECK_MSG);
        }
    }

    private void checkAnswer(String answer) {
        if (!ANSWER_YES.equals(answer) && !ANSWER_NO.equals(answer)) {
            throw new IllegalArgumentException(ANSWER_CHECK_MSG);
        }
    }

}
