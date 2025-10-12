package org.example;

public class BoatCreator extends Creator {

    @Override
    protected Product createProduct() {
        return new Boat();
    }
}
