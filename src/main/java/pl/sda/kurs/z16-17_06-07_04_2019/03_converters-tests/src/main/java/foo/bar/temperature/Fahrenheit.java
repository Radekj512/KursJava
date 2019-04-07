package foo.bar.temperature;

import java.math.BigDecimal;

public class Fahrenheit implements TemperatureUnit {
    public static final BigDecimal FAHRENHEIT_TO_CELSIUS = new BigDecimal(1.8);
    public static final BigDecimal FAHRENHEIT_TO_KELVIN = new BigDecimal(1.8); // then add 459.67

    private final BigDecimal value;

    public Fahrenheit(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
    public Kelvin toKelvin(){
        return (new Kelvin(value.add(Kelvin.KELVIN_TO_CELSIUS)));
    }
    public Celsius toCelsius(){
        return (new Celsius(value.subtract(new BigDecimal(32)).divide(Celsius.CELSIUS_TO_FAHRENHEIT, SCALE, ROUNDING_MODE)));
    }
}
