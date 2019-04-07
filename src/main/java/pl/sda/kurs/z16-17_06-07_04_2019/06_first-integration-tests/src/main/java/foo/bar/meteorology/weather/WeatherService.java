package foo.bar.meteorology.weather;

import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;

public class WeatherService {

    private final TemperatureProvider temperatureProvider;
    private final RainfallProvider rainfallProvider;
    private final WindSpeedProvider windSpeedProvider;

    public WeatherService(TemperatureProvider temperatureProvider,
                          RainfallProvider rainfallProvider,
                          WindSpeedProvider windSpeedProvider
    ) {
        this.temperatureProvider = temperatureProvider;
        this.rainfallProvider = rainfallProvider;
        this.windSpeedProvider = windSpeedProvider;
    }

    public Weather getWeather() {
        int temperature = temperatureProvider.getTemperature();
        int windSpeed = windSpeedProvider.getWindSpeed();
        int rainfallLevel = rainfallProvider.getRainfallLevel();

        return new Weather(temperature, windSpeed, rainfallLevel);
    }

}
