package com.design.patterns.structural.decorator;

import java.awt.*;

public interface GraphicElement {
    int getX();
    int getY();
    int getH();
    void draw(Graphics graphics);
}
