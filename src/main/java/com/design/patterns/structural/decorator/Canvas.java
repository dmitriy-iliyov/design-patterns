package com.design.patterns.structural.decorator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Canvas extends JFrame {
    private static Canvas instance;
    private List<GraphicElement> graphicElements = new ArrayList<>();

    private Canvas(){}

    public static Canvas getCanvas(){
        if(instance == null)
            instance = new Canvas();
        return instance;
    }

    public void addFigure(GraphicElement... localGraphicElements){
        graphicElements.addAll(Arrays.asList(localGraphicElements));
    }

    @Override
    public void paint(Graphics graphics){
        for(GraphicElement graphicElement: graphicElements)
            graphicElement.draw(graphics);
    }

}

