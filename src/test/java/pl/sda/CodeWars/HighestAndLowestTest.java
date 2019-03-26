package pl.sda.CodeWars;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighestAndLowestTest {
    @Test
    public void Test1() {
        assertEquals("42 -9", HighestAndLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}