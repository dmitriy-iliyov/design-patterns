package org.example;

public abstract class Creator {

    protected Product product;

    public void doSomething() {
        product = createProduct();
        product.doSomething();
    }

    abstract protected Product createProduct();

}
