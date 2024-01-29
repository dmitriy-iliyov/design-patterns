package org.example;

import java.awt.*;

public class Circle implements GraphicElement{
    private int x;
    private int y;
    private int r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawOval(x,y,r,r);
    }
}
