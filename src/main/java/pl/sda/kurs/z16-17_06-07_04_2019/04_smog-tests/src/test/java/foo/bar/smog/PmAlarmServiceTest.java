package foo.bar.smog;

import foo.bar.fizzbuzz.FizzBuzz;
import org.apache.commons.lang.time.StopWatch;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PmAlarmServiceTest {

    private PmAlarmService service;
    static private StopWatch timeExecution = new StopWatch();

    @BeforeAll
    static void classSetup() {
        Logger.getLogger("JUnit 5").info("Started at " + LocalTime.now());
        timeExecution.start();
    }

    @AfterAll
    static void classTeardown() {
        Logger.getLogger("JUnit 5").info("Finished at " + LocalTime.now());
        timeExecution.stop();
        Logger.getLogger("JUnit 5").info("Running time: "+ timeExecution.getTime() + " miliseconds");
    }

    @BeforeEach
    public void setup() {
        Logger.getLogger("JUnit 5").info("Executing test " + LocalTime.now());
        service = new PmAlarmService();
    }


    @Test
    void shouldReturnNoneForMeasurement_10_poland() {
        assertEquals(AlarmLevel.NONE, service.getAlarmMessage(10, Country.POLAND));
    }

    @Test
    void shouldReturnInfoForMeasurement_201_poland() {
        assertEquals(AlarmLevel.INFO, service.getAlarmMessage(201, Country.POLAND));
    }

    @Test
    void shouldReturnInfoForMeasurement_350_poland() {
        assertEquals(AlarmLevel.WARNING, service.getAlarmMessage(301, Country.POLAND));
    }

    @Test
    void shouldReturnNoneForMeasurement_10_italy() {
        assertEquals(AlarmLevel.NONE, service.getAlarmMessage(10, Country.ITALY));
    }

    @Test
    void shouldReturnInfoForMeasurement_50_italy() {
        assertEquals(AlarmLevel.INFO, service.getAlarmMessage(50, Country.ITALY));
    }

    @Test
    void shouldReturnInfoForMeasurement_100_italy() {
        assertEquals(AlarmLevel.WARNING, service.getAlarmMessage(100, Country.ITALY));
    }

    @Test
    void shouldReturnNoneForMeasurement_10_finland() {
        assertEquals(AlarmLevel.NONE, service.getAlarmMessage(10, Country.FINLAND));
    }

    @Test
    void shouldReturnInfoForMeasurement_52_finland() {
        assertEquals(AlarmLevel.INFO, service.getAlarmMessage(52, Country.FINLAND));
    }


    @Test
    void shouldReturnNoneForMeasurement_50_france() {
        assertEquals(AlarmLevel.NONE, service.getAlarmMessage(50, Country.FRANCE));
    }

    @Test
    void shouldReturnInfoForMeasurement_201_france() {
        assertEquals(AlarmLevel.WARNING, service.getAlarmMessage(201, Country.FRANCE));
    }

}
