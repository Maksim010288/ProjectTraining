package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class CarPassOfDayTest {

    @Test
    void receptionForParkingOnWeekDay() {
        CarPassOfDay carPassOfDay= new CarPassOfDay();
        Assertions.assertEquals("Проїзд дозволено",
                carPassOfDay.receptionForParkingOfWeekDay(65455, "Понеділок"));
    }

    @Test
    void receptionForParkingAllWeekThreeDigitNumber() {
        CarPassOfDay carPassOfDay= new CarPassOfDay();
        Assertions.assertEquals("Проїзд дозволено",
                carPassOfDay.receptionForParkingAllWeek(414, "Вівторок"));
    }

    @Test
    void receptionForParkingAllWeekForeDigitNumber() {
        CarPassOfDay carPassOfDay= new CarPassOfDay();
        Assertions.assertEquals("Проїзд дозволено",
                carPassOfDay.receptionForParkingAllWeek(4123, "Понеділок"));
    }

    @Test
    void receptionForParkingAllWeekFiveDigitNumber() {
        CarPassOfDay carPassOfDay= new CarPassOfDay();
        Assertions.assertEquals("Проїзд дозволено",
                carPassOfDay.receptionForParkingAllWeek(41723, "Четвер"));
    }

    @Test
    void numberOfItemsInParking(){
        CarPassOfDay carPassOfDay = new CarPassOfDay();
        carPassOfDay.receptionForParkingOfWeekDay(4534, "Пятниця");
        carPassOfDay.receptionForParkingOfWeekDay(1230, "Понеділок");
        carPassOfDay.receptionForParkingOfWeekDay(548976, "Вівторок");
        Assertions.assertEquals(3, carPassOfDay.numberCar.size());
    }
}