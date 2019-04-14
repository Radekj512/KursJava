package foo.bar.bowling;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.*;


class BowlingGameTest {

    private BowlingGame game;

    @BeforeEach
    @Description("Starting new game for test purpose")
    void setup() {
        game = new BowlingGame();
    }

    @Test
    @DisplayName("When player roll 0 pins 20 times in a row, his score should be 0 points")
    void testAllZeroGame() {
        rollMany(20, 0);

        Assertions.assertEquals(0, game.score());
    }

    @Test
    @DisplayName("When player roll 1 pin 20 times in a row, his score should be 20 points")
    void testAllOnesGame() {
        rollMany(20, 1);

        Assertions.assertEquals(20, game.score());
    }

    @Test
    @DisplayName("When player roll one spare, his next roll should be double pointed")
    void testSingleSpare() {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);
        Assertions.assertEquals(16, game.score());
    }

    @Test
    @DisplayName("When player roll one strike, his next 2 rolls should be double pointed")
    void testSingleStrike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        Assertions.assertEquals(24, game.score());
    }

    @Test
    @DisplayName("When player roll 10 in each of his rolls, he should get 300 points in total.")
    void testPerfectGame() {
        rollMany(12, 10);
        Assertions.assertEquals(300, game.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollStrike() {
        game.roll(10);
    }
}