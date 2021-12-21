package blackjack.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

    private static Player player;

    @BeforeAll
    static void beforeAll() {
        player = new Player("java");
        player.getPlayerCards().getCardsList().add(new Card("7",Card.Suit.다이아몬드));
        player.getPlayerCards().getCardsList().add(new Card("3",Card.Suit.클로버));
    }

    @Test
    void getNameTest() {
        assertThat(player.getName()).isEqualTo("java");
    }
}
