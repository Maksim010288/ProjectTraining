package org.example;

public class ParkingManager {
    MapDayAndNumber mapDayAndNumber;

    public ParkingManager() {
    }

    public ParkingManager(MapDayAndNumber mapDayAndNumber) {
        this.mapDayAndNumber = mapDayAndNumber;
    }

    public boolean sevenDayPass(CarPassOfDay carPassOfDay) {
        int remainder = carPassOfDay.getCarNumber() % 7;
        return mapDayAndNumber.carNumberDay.get(remainder) == carPassOfDay.getWeekDay();
    }

    public boolean fiveDayPass(CarPassOfDay carPassOfDay) {
        int remainder = carPassOfDay.getCarNumber() % 5;
        return mapDayAndNumber.carNumberDay.get(remainder) == carPassOfDay.getWeekDay() ||
                carPassOfDay.getWeekDay() == WeekDay.SATURDAY ||
                carPassOfDay.getWeekDay() == WeekDay.SUNDAY;
    }
}
