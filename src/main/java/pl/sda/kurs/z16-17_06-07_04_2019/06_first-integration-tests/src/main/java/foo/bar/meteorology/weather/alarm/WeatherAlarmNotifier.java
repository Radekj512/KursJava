package foo.bar.meteorology.weather.alarm;

import foo.bar.meteorology.weather.Weather;
import foo.bar.meteorology.weather.WeatherService;

public class WeatherAlarmNotifier {

    private WeatherService weatherService;


    public WeatherAlarmNotifier(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public WeatherAlarmLevel raiseLevelIfNeccessary() {
        Weather weather = weatherService.getWeather();
        WeatherAlarmLevel alarmLevel = WeatherAlarmLevel.ALL_OK;
        int alarmCount = 0;

        if (weather.getTemprature() > 35) {
            alarmCount++;
            alarmLevel = WeatherAlarmLevel.SECOND_LEVEL;
        }
        if (weather.getWindSpeed() > 100) {
            alarmCount++;
            alarmLevel = WeatherAlarmLevel.SECOND_LEVEL;
        }
        if (weather.getRainfall() > 100) {
            alarmCount++;
            alarmLevel = WeatherAlarmLevel.THIRD_LEVEL;
        }
        if (alarmCount++ > 1) {
            alarmLevel = WeatherAlarmLevel.FIRST_LEVEL;
        }
        return alarmLevel;
    }
}
