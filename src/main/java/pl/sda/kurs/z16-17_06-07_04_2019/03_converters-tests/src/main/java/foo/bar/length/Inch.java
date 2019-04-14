package foo.bar.length;

import java.math.BigDecimal;

public class Inch implements LengthUnit {
    public static final BigDecimal INCH_TO_CENTIMETER =
            new BigDecimal("2.5400").setScale(SCALE, ROUNDING_MODE);

    private final BigDecimal value;

    public Inch(BigDecimal value) {
        if (BigDecimal.ZERO.compareTo(value) > 0) {
            throw new IllegalArgumentException("Length can't be negative!");
        }
        this.value = value.setScale(SCALE, ROUNDING_MODE);
    }

    public BigDecimal getValue() {
        return value;
    }

    public Centimeter toCentimeters() {
        return new Centimeter(value.multiply(INCH_TO_CENTIMETER).setScale(SCALE, ROUNDING_MODE));
    }
}
