package foo.bar.meteorology.weather.external;

import java.util.concurrent.ThreadLocalRandom;

public class RainfallProvider {

    private final int MIN = 0;
    private final int MAX = 300;

    public RainfallProvider() {
    }

    public int getRainfallLevel() {
        ExternalServiceDelaySimulator.simulateDelayOfExternalService();
        return ThreadLocalRandom.current().nextInt(MIN,MAX + 1);
    }
}
