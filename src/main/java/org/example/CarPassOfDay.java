package org.example;

public class CarPassOfDay {
    private int carNumber = 0;
    private WeekDay weekDay = null;

    public CarPassOfDay(int carNumber, WeekDay weekDay) {
        this.carNumber = carNumber;
        this.weekDay = weekDay;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }
}
