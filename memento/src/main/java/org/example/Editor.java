package org.example;

import org.example.shapes.Shape;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<Shape> allShapes;
    private int shapeCount;

    public Editor() {
        this.allShapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        allShapes.add(shape);
    }

    public void delShape(Shape shape){
        allShapes.remove(shape);
    }

    public void printShapes(){
        for(Shape shape: allShapes)
            System.out.println(shape);
    }

    public byte[] backup(){
        this.shapeCount = allShapes.size();
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            for (Shape shape : allShapes)
                        oos.writeObject(shape);
            oos.close();
            return baos.toByteArray();
        } catch (IOException e) {
            return baos.toByteArray();
        }
    }

    public List<Shape> restore(byte [] data) {
        List<Shape> restoredShapes = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            for (int i = 0; i < this.shapeCount; i++)
                restoredShapes.add((Shape) ois.readObject());
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        } catch (IOException e) {
            System.out.print("IOException occurred.");
        }
        return restoredShapes;
    }
}
