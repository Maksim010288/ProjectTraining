package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class CarPassOfDayTest {

    @Test
    void getNumberCar() {
        CarPassOfDay day = new CarPassOfDay(5453, WeekDay.FRI);
        Assertions.assertEquals(5453, day.getNumberCar());
    }

    @Test
    void getWeekDay() {
        CarPassOfDay day = new CarPassOfDay(5453, WeekDay.FRI);
        Assertions.assertEquals(WeekDay.FRI, day.getWeekDay());
    }
}