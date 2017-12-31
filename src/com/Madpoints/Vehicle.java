package com.Madpoints;

public class Vehicle {
    private String name;
    private int engine;
    private int size;
    private int passengers;
    private int currentSpeed;
    private int currentGear;
    private String currentHeading;

    public Vehicle(String name, int engine, int size, int passengers) {
        this.name = name;
        this.engine = engine;
        this.size = size;
        this.passengers = passengers;
        this.currentSpeed = 0;
        this.currentGear = 0;
        this.currentHeading = "Straight";
    }

    public void move(int speed) {
        this.currentSpeed = speed;

        if (speed < 0) {
            changingGears(-1);
        } else if (speed == 0) {
            changingGears(0);
        } else if (speed <= 10) {
            changingGears(1);
        } else if (speed > 11 && speed <= 25) {
            changingGears(2);
        } else if (speed > 26 && speed <= 40) {
            changingGears(3);
        } else {
            changingGears(4);
        }

        System.out.println(this.name + " is moving at " + speed + "mph.");
    }

    private void changingGears(int gear) {
        this.currentGear = gear;

        if (gear == -1) {
            System.out.println("Switching to reverse.");
        } else if (gear == 0) {
            System.out.println("Switching to park.");
        }else {
            System.out.println("Switching to gear " + gear + ".");
        }
    }

    public void steering(String direction) {
        this.currentHeading = direction;

        System.out.println(this.name + " is turning " + direction + ".");
    }

    public String getName() {
        return name;
    }

    public int getEngine() {
        return engine;
    }

    public int getSize() {
        return size;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public String getCurrentHeading() {
        return currentHeading;
    }
}
