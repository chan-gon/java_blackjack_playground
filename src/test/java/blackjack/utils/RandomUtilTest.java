package blackjack.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilTest {

    @Test
    void 랜덤숫자_2에서10_생성_테스트() {
        RandomUtil randomUtil = new RandomUtil();
        assertThat(randomUtil.generateRandomNum())
                .isGreaterThan(2)
                .isLessThan(10);
    }
}