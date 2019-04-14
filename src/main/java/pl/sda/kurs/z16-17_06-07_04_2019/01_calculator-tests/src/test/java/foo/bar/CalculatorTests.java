package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTests {
int testsPassed = 0;

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @Test
    @DisplayName("0 + 101 = 101")
    void addsTwoNumbers2() {
        Calculator calculator = new Calculator();
        assertEquals(101, calculator.add(0, 101), "0 + 101 should equal 101");
    }


    @Test
    @DisplayName("-5 + (-2) = -7")
    void addsTwoNumbers3() {
        Calculator calculator = new Calculator();
        assertEquals(-7, calculator.add(-5, -2), "-5 + -2 should equal -7");
    }

    @Test
    @DisplayName("-1 + 5 = 4")
    void addsTwoNumbers4() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(-1, 5), "-1 + 5 should equal 4");
    }

    //----------SUBSTRACT TESTS-------------
    @Test
    @DisplayName("-1 - 5 = -6")
    void substractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-6, calculator.substract(-1, 5));
    }

    @Test
    @DisplayName("0 - 101 = -101")
    void substractTwoNumbers2() {
        Calculator calculator = new Calculator();
        assertEquals(-101, calculator.substract(0, 101));
    }

    @Test
    @DisplayName("5 - 6 = -1")
    void substractTwoNumbers3() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.substract(5, 6));
    }

    // ------------------ MULTIPLY TESTS--------------
    @Test
    @DisplayName("2 * 3 = 6")
    void multiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("0 * 3 = 0")
    void multiplyTwoNumbers2() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(0, 3));
    }

    @Test
    @DisplayName("-2 * 3 = -6")
    void multiplyTwoNumbers3() {
        Calculator calculator = new Calculator();
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    //----------DIVIDE TESTS--------------
    @Test
    @DisplayName("10 / 2 = 5")
    void divideTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    @DisplayName("5 / 2 = 2.5")
    void divideTwoNumbers2() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    @DisplayName("10 / 0 = IllegalArgumentException")
    void divideTwoNumbers3() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    //----------------POWER TESTS------------
    @Test
    @DisplayName("2 ^ 10 = 1024")
    void power() {
        Calculator calculator = new Calculator();
        assertEquals(1024, calculator.power(2, 10));
    }
    @Test
    @DisplayName("2 ^ -3 = 0.125")
    void power2() {
        Calculator calculator = new Calculator();
        assertEquals(0.125, calculator.power(2, -3));
    }
    @Test
    @DisplayName("2 ^ 10 = 1024")
    void power3() {
        Calculator calculator = new Calculator();
        assertEquals(1024, calculator.power(2, 10));
    }
}
