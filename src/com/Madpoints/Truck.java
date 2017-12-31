package com.Madpoints;

public class Truck extends Car {
    private int bedSize;
    private int maxLoad;
    private int currentLoad;

    public Truck(String name, int size, int passengers, int doors, int tires, int bedSize, int maxLoad) {
        super(name, size, passengers, doors, tires);
        this.bedSize = bedSize;
        this.maxLoad = maxLoad;
        this.currentLoad = 0;
    }

    public void adjustLoad(int weight) {
        if (this.currentLoad + weight > maxLoad) {
            System.out.println("Cannot carry that much weight.");
        } else {
            this.currentLoad += weight;
        }
    }

    public int getBedSize() {
        return bedSize;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }
}
