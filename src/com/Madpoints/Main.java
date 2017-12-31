package com.Madpoints;

public class Main {

    public static void main(String[] args) {

        Car volvo = new Car("740GL", 10, 4, 4, 4);

        volvo.move(40);
        volvo.steering("Straight");

        Truck ford = new Truck("F150", 15, 4, 4, 6, 10, 1500);

        ford.adjustLoad(1400);
        System.out.println("Current load: " + ford.getCurrentLoad());
        ford.move(35);
        ford.steering("Right");
        ford.adjustLoad(100);
        System.out.println("Current load: " + ford.getCurrentLoad());
    }
}
