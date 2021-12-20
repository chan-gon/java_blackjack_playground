package blackjack.model;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardsTest {

    @Test
    void 카드_숫자_계산_테스트() {
        Card card1 = new Card("2", Suit.CLOVER.getSuitName());
        Card card2 = new Card("3", Suit.DIAMOND.getSuitName());
        Card card3 = new Card("4", Suit.SPADE.getSuitName());
        Card card4 = new Card(Letter.QUEEN.getLetterName(), Suit.HEART.getSuitName());
        Cards cards1 = new Cards(Lists.list(card1, card2, card3, card4));
        int sum1 = cards1.calculateCardNum();
        assertThat(sum1).isEqualTo(19);

        Card card5 = new Card("2", Suit.CLOVER.getSuitName());
        Card card6 = new Card("3", Suit.CLOVER.getSuitName());
        Cards cards2 = new Cards(Lists.list(card5, card6));
        int sum2 = cards2.calculateCardNum();
        assertThat(sum2).isEqualTo(5);
    }
}
