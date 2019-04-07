package foo.bar.meteorology.weather.alarm;

import foo.bar.meteorology.weather.Weather;
import foo.bar.meteorology.weather.WeatherService;
import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.logging.Logger;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherAlarmNotifierTest {

    private WeatherAlarmNotifier alarmNotifier =
            new WeatherAlarmNotifier(
                    new WeatherService(
                            new TemperatureProvider(),
                            new RainfallProvider(),
                            new WindSpeedProvider()
                    )
            );


    WeatherService weatherMock = mock(WeatherService.class);

    private WeatherAlarmNotifier alarmNotifierMock = new WeatherAlarmNotifier(weatherMock);

    @ParameterizedTest(name = "When there is {1} degrees and {2} mm of rainfall and {3} km/h windspeed alarm should be {0}")
    //level, temp, rain, wind
    @CsvSource({
            "ALL_OK, 25, 1, 30",
            "THIRD_LEVEL, 30, 120, 80",
            "SECOND_LEVEL, 26, 0, 120",
            "SECOND_LEVEL, 38, 0, 0",
            "FIRST_LEVEL, 38, 110, 90",
            "FIRST_LEVEL, 23, 110, 150",
            "FIRST_LEVEL, 38, 0, 101"
    })
    void weatherAlarmWithMock(WeatherAlarmLevel expectedWeatherAlarmLevel, int temp, int rain, int wind) {

        when(weatherMock.getWeather())
                .thenReturn(new Weather(temp, wind, rain));
        Assertions.assertEquals(expectedWeatherAlarmLevel, alarmNotifierMock.raiseLevelIfNeccessary());
    }

}
