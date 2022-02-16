package org.parking;

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
        CarPassOfDay carPassOfDayWed = new CarPassOfDay(78677, WeekDay.WEDNESDAY);
        CarPassOfDay carPassOfDayThu = new CarPassOfDay(78677, WeekDay.THURSDAY);
        CarPassOfDay carPassOfDayFri = new CarPassOfDay(78677, WeekDay.FRIDAY);
        CarPassOfDay carPassOfDaySat = new CarPassOfDay(78677, WeekDay.SATURDAY);
        CarPassOfDay carPassOfDaySun = new CarPassOfDay(78677, WeekDay.SUNDAY);
        CarPassOfDay carPassOfDayMon = new CarPassOfDay(78677, WeekDay.MONDAY);
        CarPassOfDay carPassOfDayTue = new CarPassOfDay(78677, WeekDay.TUESDAY);
        ParkingManager manager = new ParkingManager();
        assertTrue(manager.fiveDayPass(carPassOfDayWed));
        assertFalse(manager.fiveDayPass(carPassOfDayThu));
        assertFalse(manager.fiveDayPass(carPassOfDayFri));
        assertTrue(manager.fiveDayPass(carPassOfDaySat));
        assertTrue(manager.fiveDayPass(carPassOfDaySun));
        assertFalse(manager.fiveDayPass(carPassOfDayMon));
        assertFalse(manager.fiveDayPass(carPassOfDayTue));
    }
}