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

    public static void main(String[] args) {
        MapDayAndNumber number = new MapDayAndNumber();
        CarPassOfDay passOfDay = new CarPassOfDay(56443, WeekDay.FRIDAY);
        ParkingManager parkingManager = new ParkingManager(number);
        System.out.println(parkingManager.fiveDayPass(passOfDay));
    }
}
