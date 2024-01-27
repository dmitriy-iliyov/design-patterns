package org.example;

public class Main {
    public static void main(String[] args) {
        Panel panel = new Panel();
        Button button1 = new Button(20, 10);
        Button button2 = new Button(53, 43);
        Button button3 = new Button(123, 12);
        Button button4 = new Button(513, 413);

        panel.addComponent(button1);
        panel.addComponent(button2);

        MouseMoveHandler handler = new MouseMoveHandler(panel);
        MouseMoveHandler button1handler = new MouseMoveHandler(button1);
        MouseMoveHandler button2handler = new MouseMoveHandler(button2);
        MouseMoveHandler button3handler = new MouseMoveHandler(button3);
        MouseMoveHandler button4handler = new MouseMoveHandler(button4);

        button1handler.setNextHandler(button2handler);
        button2handler.setNextHandler(button3handler);
        button3handler.setNextHandler(button4handler);
        button1handler.handleMouseMove();
    }
}