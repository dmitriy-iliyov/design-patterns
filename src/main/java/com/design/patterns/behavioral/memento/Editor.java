package org.example;

import org.example.shapes.Shape;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Editor {

    private List<Shape> allShapes;
    private int shapeCount;
    private History history;

    public Editor() {
        this.allShapes = new ArrayList<>();
        this.history = new History();
    }

    public void addShape(Shape shape){
        allShapes.add(shape);
        shapeCount++;
    }

    public void delShape(Shape shape){
        allShapes.remove(shape);
        shapeCount--;
    }

    public void printShapes(){
        for(Shape shape: allShapes)
            System.out.println(shape);
    }

    public void saveState(){
        history.saveBackup(new Memento(this, shapeCount));
    }

    public void restoreState(){
        allShapes = history.restoreBackup();
    }

    public String backup(){
        ByteArrayOutputStream baos;
        try {
            baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            for (Shape shape : allShapes)
                oos.writeObject(shape);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            return "";
        }
    }

    public List<Shape> restore(String data, int shapesCount) {
        List<Shape> restoredShapes = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(data)));
            for (int i = 0; i < shapesCount; i++)
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
