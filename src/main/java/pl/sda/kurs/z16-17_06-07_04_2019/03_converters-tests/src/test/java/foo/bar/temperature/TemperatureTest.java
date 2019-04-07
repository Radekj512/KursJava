package foo.bar.temperature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperatureTest {

    @ParameterizedTest(name = "{0} celcius degree should be {1} kelvin")
    @CsvSource({
            "0, 273.15",
            "10, 283.15",
            "32.5, 305.65"
    })
    void celsiusToKelvin(double a, double expected){
        Assertions.assertEquals(new BigDecimal(expected).setScale(2, RoundingMode.HALF_UP), new Celsius(new BigDecimal(a)).toKelvin().getValue());
    }

    @ParameterizedTest(name = "{0} celcius degree should be {1} fahrenheit")
    @CsvSource({
            "0, 32",
            "10, 50",
            "25.7, 78.26",
            "-20, -4"
    })
    void celsiusToFahrenheit(double a, double expected){
        Assertions.assertEquals(new BigDecimal(expected).setScale(2, RoundingMode.HALF_UP), new Celsius(new BigDecimal(a)).toFahrenheit().getValue().setScale(2, RoundingMode.HALF_UP));
    }

    @ParameterizedTest(name = "{0} celcius degree should be {1} fahrenheit")
    @CsvSource({
            "32, 0",
            "50, 10",
            "78.26, 25.7",
            "-4,-20"
    })
    void fahrenheitToCelsius(double a, double expected){
        Assertions.assertEquals(new BigDecimal(expected).setScale(2, RoundingMode.HALF_UP), new Fahrenheit(new BigDecimal(a)).toCelsius().getValue().setScale(2, RoundingMode.HALF_UP));
    }

    @ParameterizedTest(name = "{0} Kelvin  should be {1} fahrenheit")
    @CsvSource({
            "0, -459.67",
            "1000, 1340.33",
    })
    void kelvinToFahrenheit(double a, double expected){
        Assertions.assertEquals(new BigDecimal(expected).setScale(2, RoundingMode.HALF_UP), new Kelvin(new BigDecimal(a)).toFahrentheit().getValue().setScale(2, RoundingMode.HALF_UP));
    }

    @ParameterizedTest(name = "{0} Kelvin  should be {1} celcius degree")
    @CsvSource({
            "0, -273.15",
            "1000, 726.85",
    })
    void kelvinToCelcius(double a, double expected){
        Assertions.assertEquals(new BigDecimal(expected).setScale(2, RoundingMode.HALF_UP), new Kelvin(new BigDecimal(a)).toCelsius().getValue().setScale(2, RoundingMode.HALF_UP));
    }



}
