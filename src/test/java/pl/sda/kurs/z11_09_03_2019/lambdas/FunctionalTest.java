package pl.sda.kurs.z11_09_03_2019.lambdas;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FunctionalTest {

    private Functional sut;
    private List<Integer> list = Arrays.asList(4, 6, 11, 1, 8, 0, -5, 4, -1);;


    @Before
    public void setUp() throws Exception {
        sut = new Functional();
    }

    @Test
    public void testSquares() {
        List<Integer> out = sut.squares(list);
        assertEquals(Arrays.asList(16, 36, 121, 1, 64, 0, 25, 16, 1), out);
    }

    @Test
    public void testEven() {
        List<Integer> out = sut.even(list);
        assertEquals(Arrays.asList(4, 6, 8, 0, 4), out);
    }

    @Test
    public void testCountOdd() {
        long out = sut.countOdd(list);
        assertEquals(4L, out);
    }

    @Test
    public void testSmallest() {
        int out = sut.smallest(list);
        assertEquals(-5, out);
    }

    @Test
    public void testAvarage() {
        int out = sut.avarage(list);
        assertEquals(3, out);
    }

    @Test
    public void testSumOfSquares() {
        int out = sut.sumOfSquares(list);
        assertEquals(280, out);
    }

    @Test
    public void testSumOfAbs() {
        int out = sut.sumOfAbs(list);
        assertEquals(40, out);
    }

    @Test
    public void testRemoveLetter() {
        String out = sut.removeLetter("Ala ma kota", "a");
        assertEquals("l m kot", out);
    }

    @Test
    public void testRemoveWordOfLength() {
        String out = sut.removeWordOfLength("Ala ma kota", 3);
        assertEquals("ma kota", out);
    }

    @Test
    public void testRemoveWordOfLength2() {
        String out = sut.removeWordOfLength(
                "My soul is painted like the wings of butterflies " +
                        "Fairy tales of yesterday will grow but never die " +
                        "I can fly my friends", 3);

        assertEquals("My soul is painted like wings of butterflies " +
                "Fairy tales of yesterday will grow never " +
                "I my friends", out);
    }

    @Test
    public void testRemoveNumbers() {
        String out = sut.removeNumbers("Ala ma kota");
        assertEquals("Ala ma kota", out);
    }

    @Test
    public void testRemoveNumbers2() {
        String out = sut.removeNumbers("Jeden dla mnie, 2 dla ciebie, 3 dla szefa, 4 na podatki.");
        assertEquals("Jeden dla mnie, dla ciebie, dla szefa, na podatki.", out);
    }
}
