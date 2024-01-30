package org.example;

import java.awt.*;

public class CircleDecorator extends BaseDecorator{
    private int x;
    private int y;
    private int r;

    public CircleDecorator(GraphicElement graphicElement) {
        super(graphicElement);
        this.x = graphicElement.getX();
        this.y = graphicElement.getY();
        this.r = graphicElement.getH();
    }

    @Override
    public void draw(Graphics graphics){
        super.draw(graphics);
        graphics.setColor(Color.RED);
        graphics.drawRect(x,y,2*r,2*r);
    }
}
