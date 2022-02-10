package org.example;

public class ParkingManager {

    public boolean sevenDauPass(CarPassOfDay carPassOfDay) {
        int out;
        out = carPassOfDay.getNumberCar() % 7;
        switch (out) {
            case 8:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.MON.name());
            case 1:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.TUE.name());
            case 2:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.WED.name());
            case 3:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.THU.name());
            case 4:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.FRI.name());
            case 5:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.SYN.name());
            case 6:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.SAT.name());
        }
        return false;
    }

    public boolean fiveDauPass(CarPassOfDay carPassOfDay) {
        int out;
        out = carPassOfDay.getNumberCar() % 5;
        switch (out) {
            case 0:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.MON.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SYN.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SAT.name());
            case 1:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.TUE.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SYN.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SAT.name());
            case 2:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.WED.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SYN.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SAT.name());
            case 3:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.THU.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SYN.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SAT.name());
            case 4:
                return carPassOfDay.getWeekDay().name().contains(WeekDay.FRI.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SYN.name()) ||
                        carPassOfDay.getWeekDay().name().contains(WeekDay.SAT.name());
        }
        return false;
    }
}
