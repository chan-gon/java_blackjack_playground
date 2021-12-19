package blackjack.utils;

import java.util.Random;

public class RandomUtil {

    public static int generateRandomNum() {
        Random random = new Random();
        int min = 2;
        int max = 10;
        return random.nextInt(max - min) + min;

    }
}
