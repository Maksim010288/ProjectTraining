package colections;

import org.parking.WeekDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MyMapTest {


    @Test
    void getKey() {
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.WEDNESDAY, 2);
        myMap.put(WeekDay.THURSDAY, 3);
        myMap.put(WeekDay.FRIDAY, 4);
        assertEquals(0, myMap.get(WeekDay.MONDAY));
    }

    @Test
    void getKeyWednesday() {
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.WEDNESDAY, 2);
        myMap.put(WeekDay.THURSDAY, 3);
        myMap.put(WeekDay.FRIDAY, 4);
        assertEquals(1, myMap.get(WeekDay.TUESDAY));
        assertEquals(6, myMap.size());
    }


    @Test
    void getRefactor() {
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.TUESDAY, 1);
        assertEquals(1, myMap.get(WeekDay.TUESDAY));
        assertEquals(6, myMap.size());
    }

}