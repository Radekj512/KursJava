package foo.bar.meteorology.weather.external;

import java.util.concurrent.ThreadLocalRandom;

public class TemperatureProvider {

    private final int MIN = -30;
    private final int MAX = 45;

    public int getTemperature() {
        ExternalServiceDelaySimulator.simulateDelayOfExternalService();
        return ThreadLocalRandom.current().nextInt(MIN,MAX + 1);
    }


}
