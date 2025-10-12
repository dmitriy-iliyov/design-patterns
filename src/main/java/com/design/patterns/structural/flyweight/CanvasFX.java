package org.example;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public class CanvasFX extends Canvas {

    private List<Figure> figures = new ArrayList<>();

    public CanvasFX(double width, double height) {
        super(width, height);
    }

    public void addFigure(String colorName, int x1, int y1, int x2, int y2) {
        Line line = new Line(colorName, x1, y1, x2, y2);
        figures.add(line);
    }

    public void drawAll() {
        GraphicsContext gc = this.getGraphicsContext2D();
        for (Figure figure : figures) {
            figure.draw(gc);
        }
    }
}
