package org.parking;

import java.util.HashMap;
import java.util.Map;

public class MapDayAndNumber {
    Map<Integer, WeekDay> carNumberDay = new HashMap<>();

    {
        carNumberDay.put(0, WeekDay.MONDAY);
        carNumberDay.put(1, WeekDay.TUESDAY);
        carNumberDay.put(2, WeekDay.WEDNESDAY);
        carNumberDay.put(3, WeekDay.THURSDAY);
        carNumberDay.put(4, WeekDay.FRIDAY);
        carNumberDay.put(5, WeekDay.SATURDAY);
        carNumberDay.put(6, WeekDay.SUNDAY);
    }
}
