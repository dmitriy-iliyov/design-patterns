package com.design.patterns.generating.factory_method;

public class BoatCreator extends Creator {

    @Override
    protected Product createProduct() {
        return new Boat();
    }
}
