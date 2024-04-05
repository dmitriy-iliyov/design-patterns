package org.example;

public class Main {
    public static void main(String[] args) {
        Truck truck = Truck.builder().owner("Maks").driver("Maks").stsNumber("3198 1273").trailer(null).build();
        Truck truck2 = new Truck("oleg", "234244 142", 12, null, "olya", 30);
        System.out.println(truck);
        System.out.println(truck2);
    }
}