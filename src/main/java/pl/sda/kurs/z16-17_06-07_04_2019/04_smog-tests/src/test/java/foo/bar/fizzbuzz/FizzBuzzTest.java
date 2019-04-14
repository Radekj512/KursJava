package foo.bar.fizzbuzz;

import foo.bar.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fb;

    @BeforeAll
    static void classSetup() {
        Logger.getLogger("JUnit 5").info("Started at " + LocalTime.now());
    }

    @AfterAll
    static void classTeardown() {
        Logger.getLogger("JUnit 5").info("Finished at " + LocalTime.now());
    }

    @BeforeEach
    public void setup() {
        Logger.getLogger("JUnit 5").info("Executing test " + LocalTime.now());
        fb = new FizzBuzz();
    }

    @Test
    public void shouldReturnFizzBuzzIfDiv3And5() {
        assertEquals("FizzBuzz", fb.fizzBuzz(15));
        assertEquals("FizzBuzz", fb.fizzBuzz(30));
        assertEquals("FizzBuzz", fb.fizzBuzz(45));
    }

    @Test
    public void shouldReturnFizzIfDiv3() {
        assertEquals("Fizz", fb.fizzBuzz(9));
        assertEquals("Fizz", fb.fizzBuzz(12));
        assertEquals("Fizz", fb.fizzBuzz(-33));
    }

    @Test
    public void shouldReturnBuzzIfDiv5() {
        assertEquals("Buzz", fb.fizzBuzz(5));
        assertEquals("Buzz", fb.fizzBuzz(55));
        assertEquals("Buzz", fb.fizzBuzz(-5555));
    }
}
