package pl.gda.wsb.devices;

import pl.gda.wsb.CarManufacturers;

public class Car {
    final String model;
    final CarManufacturers producer;
    String color;
    int doors;
    private Double worth;

    public Car(String model, CarManufacturers producer, String color, int doors, Double worth) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.doors = doors;
        this.worth = worth;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(Double worth) {
        this.worth = worth;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", worth=" + worth +
                '}';
    }
}
