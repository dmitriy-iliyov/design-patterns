package org.example;

import java.awt.*;

public class CircleDecorator extends BaseDecorator{

    public CircleDecorator(GraphicElement graphicElement) {
        super(graphicElement);
    }

    @Override
    public void draw(Graphics graphics){
        super.draw(graphics);
        graphics.setColor(Color.RED);
        graphics.drawRect(x,y,2*r,2*r);
    }
}
