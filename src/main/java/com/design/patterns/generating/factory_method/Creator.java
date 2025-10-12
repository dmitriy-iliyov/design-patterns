package com.design.patterns.generating.factory_method;

public abstract class Creator {

    protected Product product;

    public void doSomething() {
        product = createProduct();
        product.doSomething();
    }

    abstract protected Product createProduct();

}
