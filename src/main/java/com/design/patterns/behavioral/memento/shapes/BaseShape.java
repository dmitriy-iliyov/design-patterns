package com.design.patterns.behavioral.memento.shapes;


public class BaseShape implements Shape {
    private int x, y;
    private String color;

    public BaseShape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }
    @Override
    public String toString(){
        return "{x  = " + this.x + ", y = " + this.y + ", color = " + this.color + "}";
    }
}
