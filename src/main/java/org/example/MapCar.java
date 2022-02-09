package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapCar {
    ParkingManager manager = new ParkingManager();
    Map<Integer, WeekDay> saveNumberEndDay = new HashMap<>();

    public void outCarNumberEndDay(CarPassOfDay carPassOfDay) {
        if (manager.fiveDauPass(carPassOfDay) || manager.sevenDauPass(carPassOfDay)) {
            saveNumberEndDay.put(carPassOfDay.getNumberCar(), carPassOfDay.getWeekDay());
        }
    }

    public Map<Integer, WeekDay> out() {
        for (Map.Entry<Integer, WeekDay> outWeekDay : saveNumberEndDay.entrySet()) {
            System.out.println(outWeekDay.toString());
        }
        return null;
    }
}
