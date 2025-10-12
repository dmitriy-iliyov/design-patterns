package org.example;

import org.example.shapes.Rectangle;
import org.example.shapes.Shape;
import org.example.shapes.Triangl;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.addShape(new Rectangle(1, 2, "red"));
        editor.addShape(new Triangl(3, 5, "blue"));
        editor.printShapes();
        editor.saveState();
        System.out.println("---------------------------");
        editor.addShape(new Triangl(3, 4, "blue"));
        editor.printShapes();
        System.out.println("---------------------------");
        editor.restoreState();
        editor.printShapes();
    }
}