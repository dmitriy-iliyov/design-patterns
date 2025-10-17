package com.design.patterns.generating.factory_method;

public class TruckCreator implements Creator{
    @Override
    public Transport createProduct() {
        return new Truck();
    }
}
