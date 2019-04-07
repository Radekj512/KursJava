package foo.bar.temperature;

import java.math.RoundingMode;

public interface TemperatureUnit {
    int SCALE = 2;
    RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;
}
