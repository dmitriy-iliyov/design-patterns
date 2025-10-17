package com.design.patterns.structural.decorator;


public class DecoratorExample {

    private final static int CANVAS_SIZE = 500;

    public static void main(String [] args) throws InterruptedException {
        Canvas canvas = Canvas.getCanvas();
        Circle circle = new Circle(random(),random(),30);
        Circle circle1 = new Circle(random(),random(),20);
        CircleDecorator circleDecorator = new CircleDecorator(circle1);
        canvas.addFigure(circle, circleDecorator);
        canvas.setSize(CANVAS_SIZE, CANVAS_SIZE);
        canvas.setVisible(true);

        Thread.sleep(5000);
    }

    public static int random(){
        return (int) (Math.random() * ((CANVAS_SIZE)+1));
    }
}
