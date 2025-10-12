package com.design.patterns.generating.factory_method;

public class TruckCreator extends Creator{
    @Override
    protected Product createProduct() {
        return new Truck();
    }
}
