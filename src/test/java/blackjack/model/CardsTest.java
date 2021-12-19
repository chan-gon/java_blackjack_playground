package blackjack.model;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardsTest {

    @Test
    void 카드_숫자_계산_테스트() {
        Card card1 = new Card(2, Card.CLOVER);
        Card card2 = new Card(3, Card.HEART);
        Card card3 = new Card(4, Card.SPADE);
        Card card4 = new Card(5, Card.DIAMOND);
        Cards cards = new Cards(Lists.list(card1, card2, card3, card4));
        int sum = cards.calculateCardNum();
        assertThat(sum).isEqualTo(14);

    }
}
