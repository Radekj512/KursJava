package foo.bar.meteorology.weather;

import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

class WeatherServiceTest {

    private WeatherService weatherService =
        new WeatherService(
            new TemperatureProvider(),
            new RainfallProvider(),
            new WindSpeedProvider()
        );

    @Test
    void testWeatherService() {
        Weather weather = weatherService.getWeather();
        Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());

        Assertions.assertNotNull(weather);
    }
}
