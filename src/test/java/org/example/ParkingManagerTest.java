package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingManagerTest {

    @Test
    void sevenDayPass() {
        CarPassOfDay carPassOfDay = new CarPassOfDay(78676, WeekDay.THURSDAY);
        ParkingManager manager = new ParkingManager();
        assertTrue(manager.sevenDayPass(carPassOfDay));
    }

    @Test
    void fiveDayPass() {
        CarPassOfDay carPassOfDay = new CarPassOfDay(78674, WeekDay.FRIDAY);
        CarPassOfDay carPassOfDay1 = new CarPassOfDay(78674, WeekDay.SATERDAY);
        CarPassOfDay carPassOfDay2 = new CarPassOfDay(78674, WeekDay.SUNDAY);
        ParkingManager manager = new ParkingManager();
        assertTrue(manager.fiveDayPass(carPassOfDay));
        assertTrue(manager.fiveDayPass(carPassOfDay1));
        assertTrue(manager.fiveDayPass(carPassOfDay2));
    }
}