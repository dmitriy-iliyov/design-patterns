package com.design.patterns.generating.factory_method;

public class BoatCreator implements Creator {

    @Override
    public Transport createProduct() {
        return new Boat();
    }
}
