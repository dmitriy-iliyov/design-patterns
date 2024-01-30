package org.example;

import java.awt.*;

public interface GraphicElement {
    int getX();
    int getY();
    int getH();
    void draw(Graphics graphics);
}
