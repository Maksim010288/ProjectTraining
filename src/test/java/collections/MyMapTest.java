package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.parking.WeekDay;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMapTest {


    @Test
    void should_get_value_by_key() {
        MyMap<Integer, WeekDay> myMap = new MyMap<>();
        myMap.put(0, WeekDay.MONDAY);
        myMap.put(1, WeekDay.TUESDAY);
        myMap.put(2, WeekDay.WEDNESDAY);
        myMap.put(3, WeekDay.THURSDAY);
        myMap.put(4, WeekDay.FRIDAY);
        assertEquals(WeekDay.FRIDAY, myMap.get(4));
        assertEquals(WeekDay.WEDNESDAY, myMap.get(2));
        assertEquals(WeekDay.MONDAY, myMap.get(0));
    }

    @Test
    void should_replace_duplicate() {
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.WEDNESDAY, 2);
        myMap.put(WeekDay.THURSDAY, 3);
        myMap.put(WeekDay.FRIDAY, 4);
        assertEquals(1, myMap.get(WeekDay.TUESDAY));
        assertEquals(5, myMap.size());
    }

    @Test
    void should_overwrite_the_same_value() {
        MyMap<Integer, WeekDay> myMap = new MyMap<>();
        myMap.put(0, WeekDay.MONDAY);
        myMap.put(0, WeekDay.TUESDAY);
        assertEquals(WeekDay.TUESDAY, myMap.get(0));
    }
}