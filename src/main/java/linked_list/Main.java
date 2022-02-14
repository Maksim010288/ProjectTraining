package linked_list;

import linked.MyMap;
import org.example.WeekDay;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.WEDNESDAY, 2);
        myMap.put(WeekDay.THURSDAY, 3);
        myMap.put(WeekDay.FRIDAY, 4);
        System.out.println(myMap);
        System.out.println(myMap.get(4));

    }
}
