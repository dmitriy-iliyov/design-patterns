package com.design.patterns.structural.adapter;

public class Circle {

    protected double ro;
    protected double phi;
    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing circle on "+ this.phi + ", " + this.ro + " with radius " + this.radius + "...");
    }
}
