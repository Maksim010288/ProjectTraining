package org.example;

public class CarPassOfDay {
    private int numberCar = 0;
    private WeekDay weekDay = null;

    public CarPassOfDay(int numberCar, WeekDay weekDay) {
        this.numberCar = numberCar;
        this.weekDay = weekDay;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }
}
