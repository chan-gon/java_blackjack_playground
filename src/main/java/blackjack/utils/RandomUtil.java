package blackjack.utils;

import java.util.Random;

public class RandomUtil {
    public static final int MIN_NUM = 2;
    public static final int MAX_NUM = 10;

    public static int generateRandomNum() {
        Random random = new Random();
        return random.nextInt(MAX_NUM - MIN_NUM) + MIN_NUM;
    }
}
