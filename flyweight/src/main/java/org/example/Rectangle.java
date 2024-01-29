package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Figure{
    private int x1;
    private int y1;
    private int x3;
    private int y3;
    private List<Line> lines = new ArrayList<>();

    public Rectangle(int x1, int y1, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void setLinesColors(List<LineFlyweight> linesColors){
        if(linesColors.size() == 4){
            lines.add(new Line(x1, y1, x3, y1, linesColors.get(0)));
            lines.add(new Line(x3, y1, x3, y3, linesColors.get(1)));
            lines.add(new Line(x3, y3, x1, y3, linesColors.get(2)));
            lines.add(new Line(x1, y3, x1, y1, linesColors.get(3)));
        }
        else if(linesColors.size() == 2){
            lines.add(new Line(x1, y1, x3, y1, linesColors.get(0)));
            lines.add(new Line(x3, y1, x3, y3, linesColors.get(1)));
            lines.add(new Line(x3, y3, x1, y3, linesColors.get(0)));
            lines.add(new Line(x1, y3, x1, y1, linesColors.get(1)));
        }
    }

    public void draw(Graphics graphics){
        for(Line line : lines)
            line.draw(graphics);
    }
}
