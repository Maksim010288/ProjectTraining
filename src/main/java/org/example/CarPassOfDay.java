package org.example;

import java.util.HashMap;
import java.util.Map;

public class CarPassOfDay {
    private int out = 0;
    public Map<Integer, String> numberCar = new HashMap<>();
    String[] deyWeek = {"Понеділок", "Вівторок", "Середа", "Четвер", "Пятниця", "Субота", "Неділя"};

    public String receptionForParkingOfWeekDay(Integer number, String day) {
        numberCar.put(number, day);
        number = number % 5;
        while (out < 10) {
            if (out == number && numberCar.containsValue(deyWeek[out])) {
                return "Проїзд дозволено";
            }
            out++;
        }
        return "Проїзд заборонено";
    }

    public String receptionForParkingAllWeek(Integer number, String day) {
        numberCar.put(number, day);
        number = number % 7;
        while (out < 10){
            if(out == number && numberCar.containsValue(deyWeek[out])){
                return "Проїзд дозволено";
            }
            out++;
        }
        return "Проїзд заборонено";
    }
}
