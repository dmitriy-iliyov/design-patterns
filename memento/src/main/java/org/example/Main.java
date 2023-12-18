package org.example;

import org.example.shapes.Rectangle;
import org.example.shapes.Shape;
import org.example.shapes.Triangl;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.addShape(new Rectangle(1, 2, "red"));
        Memento memento = new Memento(editor);
        editor.printShapes();
        editor.addShape(new Triangl(3, 5, "blue"));
        editor.printShapes();
        for (Shape shape : memento.restore())
            System.out.println(shape);
    }
}