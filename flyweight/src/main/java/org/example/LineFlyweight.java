package org.example;

import java.awt.*;


public class LineFlyweight {
    private String name;
    private Color color;

    public LineFlyweight(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void draw(Graphics graphics, int x1, int y1, int x2, int y2){
        graphics.setColor(this.color);
        graphics.drawLine(x1, y1, x2, y2);
    }
}
