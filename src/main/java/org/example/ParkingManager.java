package org.example;

import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    Map<Integer, WeekDay> weekDayMap = new HashMap<>();
    WeekDay[] weekDay = {WeekDay.MONDAY, WeekDay.TUESDAY, WeekDay.WEDNESDAY,
                         WeekDay.THURSDAY, WeekDay.FRIDAY, WeekDay.SATERDAY,
                         WeekDay.SUNDAY};

    public boolean sevenDayPass(CarPassOfDay carPassOfDay) {
        int count = 0;
        int out = carPassOfDay.getCarNumber() % 7;
        System.out.println(out);
        weekDayMap.put(out, carPassOfDay.getWeekDay());
        while (count <= out) {
            if (count == out && weekDayMap.containsValue(weekDay[count])) {
                return true;
            }
            count++;
        }
        return false;
    }

    public boolean fiveDayPass(CarPassOfDay carPassOfDay) {
        int count = 0;
        int out = carPassOfDay.getCarNumber() % 5;
        System.out.println(out);
        weekDayMap.put(out, carPassOfDay.getWeekDay());
        while (count <= out) {
            if (count == out && weekDayMap.containsValue(weekDay[count]) ||
                                weekDayMap.containsValue(weekDay[5]) ||
                                weekDayMap.containsValue(weekDay[6])){
                return true;
            }
            count++;
        }
        return false;
    }
}
