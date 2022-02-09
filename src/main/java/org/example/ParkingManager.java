package org.example;

import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    Map<Integer, WeekDay> weekDayMap = new HashMap<>();

    public boolean sevenDauPass(Integer number, WeekDay day) {
        int out;
        out = number % 7;
        weekDayMap.put(out, WeekDay.MON);
        System.out.println(out);
        switch (out) {
            case 0:
                return day.name().contains(WeekDay.MON.name());
            case 1:
                return day.name().contains(WeekDay.TUE.name());
            case 2:
                return day.name().contains(WeekDay.WED.name());
            case 3:
                return day.name().contains(WeekDay.THU.name());
            case 4:
                return day.name().contains(WeekDay.FRI.name());
            case 5:
                return day.name().contains(WeekDay.SYN.name());
            case 6:
                return day.name().contains(WeekDay.SAT.name());
        }
        return false;
    }

    public boolean fiveDauPass(Integer number, WeekDay day) {
        int out;
        out = number % 5;
        System.out.println(out);
        switch (out) {
            case 0:
                return day.name().contains(WeekDay.MON.name()) ||
                        day.name().contains(WeekDay.SYN.name()) ||
                        day.name().contains(WeekDay.SAT.name());
            case 1:
                return day.name().contains(WeekDay.TUE.name()) ||
                        day.name().contains(WeekDay.SYN.name()) ||
                        day.name().contains(WeekDay.SAT.name());
            case 2:
                return day.name().contains(WeekDay.WED.name()) ||
                        day.name().contains(WeekDay.SYN.name()) ||
                        day.name().contains(WeekDay.SAT.name());
            case 3:
                return day.name().contains(WeekDay.THU.name()) ||
                        day.name().contains(WeekDay.SYN.name()) ||
                        day.name().contains(WeekDay.SAT.name());
            case 4:
                return day.name().contains(WeekDay.FRI.name()) ||
                        day.name().contains(WeekDay.SYN.name()) ||
                        day.name().contains(WeekDay.SAT.name());
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingManager manager = new ParkingManager();
        boolean out = manager.fiveDauPass(6545, WeekDay.TUE);
        System.out.println(out);
    }
}
