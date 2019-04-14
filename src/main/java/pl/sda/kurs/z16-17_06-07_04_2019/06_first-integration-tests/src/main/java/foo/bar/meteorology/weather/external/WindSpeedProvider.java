package foo.bar.meteorology.weather.external;

import java.util.concurrent.ThreadLocalRandom;

public class WindSpeedProvider {

    private final int MIN = 0;
    private final int MAX = 150;

    public int getWindSpeed() {
        ExternalServiceDelaySimulator.simulateDelayOfExternalService();
        return ThreadLocalRandom.current().nextInt(MIN,MAX + 1);
    }
}
