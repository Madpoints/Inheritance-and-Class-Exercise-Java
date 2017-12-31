package com.Madpoints;

public class Car extends Vehicle {
    private int doors;
    private int tires;

    public Car(String name, int size, int passengers, int doors, int tires) {
        super(name,1, size, passengers);
        this.doors = doors;
        this.tires = tires;
    }

    public int getDoors() {
        return doors;
    }

    public int getTires() {
        return tires;
    }
}
