package foo.bar.blockchain.external;

import foo.bar.meteorology.weather.external.ExternalServiceDelaySimulator;

/**
 * This class has been created only for purpose of simulating
 * heavy process which can take quite some time
 * and it is worth to mock it in tests.
 */
public class GlobalIndexExternalService {

    private Long currentIndex = 0l;

    public Long calculateGlobalIndex() {
        slowItDownForHeavinesSimulationPurposes();
        currentIndex = currentIndex + 1l;
        return currentIndex;
    }

    private void slowItDownForHeavinesSimulationPurposes() {
        ExternalServiceDelaySimulator.simulateDelayOfExternalService();
    }

}
