package foo.bar.temperature;

import java.math.BigDecimal;

public class Celsius implements TemperatureUnit {
    private final BigDecimal value;

    public static final BigDecimal CELSIUS_TO_KELVIN = new BigDecimal(-273.15).setScale(SCALE, ROUNDING_MODE);
    public static final BigDecimal CELSIUS_TO_FAHRENHEIT = new BigDecimal(1.8).setScale(SCALE, ROUNDING_MODE);

    public Celsius(BigDecimal value) {
        this.value = value.setScale(SCALE, ROUNDING_MODE);
    }
    public BigDecimal getValue(){
        return value;
    }
    public Kelvin toKelvin(){
        return (new Kelvin(value.add(Kelvin.KELVIN_TO_CELSIUS)));
    }
    public Fahrenheit toFahrenheit(){
        return (new Fahrenheit(value.multiply(Fahrenheit.FAHRENHEIT_TO_CELSIUS).setScale(SCALE, ROUNDING_MODE).add(new BigDecimal(32))));
    }

}
