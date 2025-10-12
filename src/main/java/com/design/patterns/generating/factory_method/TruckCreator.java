package org.example;

public class TruckCreator extends Creator{

    @Override
    protected Product createProduct() {
        return new Truck();
    }
}
