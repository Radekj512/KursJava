package foo.bar.meteorology.weather;

import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
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

    TemperatureProvider tempMock = mock(TemperatureProvider.class);
    RainfallProvider rainMock = mock(RainfallProvider.class);
    WindSpeedProvider windMock = mock(WindSpeedProvider.class);

    WeatherService weatherServiceWithMock =
            new WeatherService(
                    tempMock,
                    rainMock,
                    windMock
            );

    @Test
    void testWeatherServiceWithMock() {
        when(tempMock.getTemperature())
                .thenReturn(10);
        when(rainMock.getRainfallLevel())
                .thenReturn(5);
        when(windMock.getWindSpeed())
                .thenReturn(20);
        Weather weather = weatherServiceWithMock.getWeather();
        Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());

        Assertions.assertNotNull(weather);
    }
}
