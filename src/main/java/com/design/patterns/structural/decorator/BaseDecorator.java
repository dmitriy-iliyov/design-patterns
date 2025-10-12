package org.example;

import java.awt.*;

public class BaseDecorator implements GraphicElement{

    private GraphicElement graphicElement;
    protected int x;
    protected int y;
    protected int r;

    public BaseDecorator(GraphicElement graphicElement) {
        this.graphicElement = graphicElement;
        this.x = graphicElement.getX();
        this.y = graphicElement.getY();
        this.r = graphicElement.getH();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getH() {
        return r;
    }

    @Override
    public void draw(Graphics graphics) {
        graphicElement.draw(graphics);
    }
}
