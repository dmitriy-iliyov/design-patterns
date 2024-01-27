package org.example;

public class Window implements EventListener{
    String model;

    public Window(String model) {
        this.model = model;
    }

    @Override
    public void update() {
        System.out.println("Window " + this.model + " closed");
    }
}
