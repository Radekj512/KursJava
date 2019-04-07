package foo.bar.meteorology.weather.external;

import java.util.Random;

public class ExternalServiceDelaySimulator {

    private static final int MAX_SERVICE_DELAY_TIME = 5000;
    private static Random rand = new Random();


    public static void simulateDelayOfExternalService(int maxDelayTime) {
        try {
            Thread.sleep(rand.nextInt(maxDelayTime));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void simulateDelayOfExternalService() {
        try {
            Thread.sleep(rand.nextInt(MAX_SERVICE_DELAY_TIME));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
