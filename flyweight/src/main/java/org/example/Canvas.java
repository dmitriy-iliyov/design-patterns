package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JFrame {
    private List<Figure> figures = new ArrayList<>();

    public void addFigure(int x1, int y1, int x3, int y3, String name, Color color){
        LineFlyweight lineColor = FlyweightFactory.getLineFlyweight(name, color);
        Line line = new Line(x1, y1, x3, y3, lineColor);
        figures.add(line);
    }

    @Override
    public void paint(Graphics graphics){
        for(Figure figure : figures)
            figure.draw(graphics);
    }

}
