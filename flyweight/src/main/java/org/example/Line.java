package org.example;

import java.awt.*;

public class Line implements Figure{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private LineFlyweight lineFlyweight;

    public Line(int x1, int y1, int x2, int y2, LineFlyweight lineFlyweight) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.lineFlyweight = lineFlyweight;
    }

    public void draw(Graphics graphics){
        lineFlyweight.draw(graphics, x1, y1, x2, y2);
    }
}
