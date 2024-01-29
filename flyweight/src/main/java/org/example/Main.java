package org.example;

import java.awt.*;

public class Main {
    private final static int CANVAS_SIZE = 500;
    private final static int FIGURES_COUNT = 100000;

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        for(int i = 0; i < Math.floor((double) FIGURES_COUNT /4); i++){
            canvas.addFigure(random(),random(),random(),random(),"red", Color.red);
            canvas.addFigure(random(),random(),random(),random(),"blue", Color.blue);
            canvas.addFigure(random(),random(),random(),random(),"green", Color.green);
            canvas.addFigure(random(),random(),random(),random(),"green", Color.green);
        }
        canvas.setSize(CANVAS_SIZE, CANVAS_SIZE);
        canvas.setVisible(true);
    }

    public static int random(){
        return (int) (Math.random() * ((CANVAS_SIZE)+1));
    }
}