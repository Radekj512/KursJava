package foo.bar.length;

import foo.bar.length.Centimeter;
import foo.bar.length.Inch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LengthTests {

    @Test
    void shouldConvertZeroCentimetersValue() {
        Centimeter cm = new Inch(BigDecimal.ZERO).toCentimeters();
        assertEquals(BigDecimal.ZERO.setScale(4), cm.getValue());
    }

    @Test
    void shouldConvertZeroInchesValue() {
        Inch in = new Centimeter(BigDecimal.ZERO).toInches();
        assertEquals(BigDecimal.ZERO.setScale(4), in.getValue());
    }

    @Test
    void shouldConvertOneCentimeterValue() {
        assertEquals(new BigDecimal("2.5400"), new Inch(BigDecimal.ONE).toCentimeters().getValue());
    }

    @Test
    void shouldConvertOneInchValue() {
        assertEquals(new BigDecimal("0.3938"), new Centimeter(BigDecimal.ONE).toInches().getValue());
    }

    @Test
    void shouldntAcceptNegativeLengthInInches() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Inch(new BigDecimal(-1))
        );
        assertEquals("Length can't be negative!", exception.getMessage());
    }
}
