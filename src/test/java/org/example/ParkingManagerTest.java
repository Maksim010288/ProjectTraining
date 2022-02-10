package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingManagerTest {

    @Test
    void sevenDauPass() {
        ParkingManager manager = new ParkingManager();
        CarPassOfDay carPassOfDay = new CarPassOfDay(56434, WeekDay.FRI);
        assertFalse(manager.sevenDauPass(carPassOfDay));
    }

    @Test
    void fiveDauPass() {
        CarPassOfDay carPassOfDay = new CarPassOfDay(56434, WeekDay.FRI);
        ParkingManager manager = new ParkingManager();
        assertTrue(manager.fiveDauPass(carPassOfDay));
    }
}