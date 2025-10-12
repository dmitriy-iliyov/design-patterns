package org.example;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line implements Figure {

    private String colorName;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(String colorName, int x1, int y1, int x2, int y2) {
        this.colorName = colorName.toLowerCase();
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        Color color = ColorFactory.getColor(colorName);
        graphicsContext.setStroke(color);
        graphicsContext.strokeLine(x1, y1, x2, y2);
    }
}
