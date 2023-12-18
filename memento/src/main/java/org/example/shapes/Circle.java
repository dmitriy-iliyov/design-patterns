package org.example.shapes;


public class Circle extends BaseShape {
    private  int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }
}
