package pl.sda.kurs.z12_10_03_2019;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void checkBracketsTest() {
        assertEquals(true, Task3.checkBrackets("{{([][])}()}") );
    }
    @Test
    public void checkBracketsTest2() {
        assertEquals(false, Task3.checkBrackets("[{()]") );
    }
}