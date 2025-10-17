package com.design.patterns.structural.adapter;

public class CircleAdapter extends Circle {

    private Pointable center;

    public CircleAdapter(int radius, Pointable center) {
        super(radius);
        this.center = center;
        setPhi();
        setRo();
    }

    private void setPhi() {
        this.phi = Math.atan((double) center.getY() /center.getX());
    }

    private void setRo() {
        this.ro = Math.sqrt(center.getX() * center.getX() + center.getY() * center.getY());
    }

    @Override
    public void draw() {
        System.out.println("Drawing adapted circle on "+ this.phi + ", " + this.ro + " with radius " + this.radius + "...");
    }
}
