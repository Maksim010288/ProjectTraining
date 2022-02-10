package linked_list;

import org.example.CarPassOfDay;
import org.example.MapCar;
import org.example.WeekDay;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        MapCar mapCar = new MapCar();
        CarPassOfDay carPassOfDay = new CarPassOfDay(6754, WeekDay.FRI);
        CarPassOfDay carPassOfDay1 = new CarPassOfDay(9872, WeekDay.WED);
        CarPassOfDay carPassOfDay2 = new CarPassOfDay(9873, WeekDay.THU);
        CarPassOfDay carPassOfDay3 = new CarPassOfDay(9870, WeekDay.WED);
        mapCar.outCarNumberEndDay(carPassOfDay);
        mapCar.outCarNumberEndDay(carPassOfDay1);
        mapCar.outCarNumberEndDay(carPassOfDay2);
        mapCar.outCarNumberEndDay(carPassOfDay3);
        mapCar.out();
    }
}
