package org.example;


public class Main {
    public static void main(String[] args) {
        Creator boatCreator = new BoatCreator();
        Creator truckCreator = new TruckCreator();

        boatCreator.doSomething();
        truckCreator.doSomething();
    }
}