package foo.bar.temperature;

import java.math.BigDecimal;

public class Kelvin implements TemperatureUnit {
    private final BigDecimal value;

    public static final BigDecimal KELVIN_TO_CELSIUS = new BigDecimal(273.15).setScale(SCALE, ROUNDING_MODE);
    public static final BigDecimal KELVIN_TO_FAHRENHEIT = new BigDecimal(459.67).setScale(SCALE, ROUNDING_MODE); //then multiply by 1.8


    public Kelvin(BigDecimal value) {
        this.value = value.setScale(SCALE, ROUNDING_MODE);
    }

    public BigDecimal getValue() {
        return value;
    }

    public Fahrenheit toFahrentheit() {
        return new Fahrenheit(value.multiply(new BigDecimal(1.8)).subtract(KELVIN_TO_FAHRENHEIT));
    }

    public Celsius toCelsius() {
        return new Celsius(value.subtract(KELVIN_TO_CELSIUS));
    }
}
// todo -> dokoncz
