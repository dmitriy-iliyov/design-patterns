package com.design.patterns.behavioral.memento;


import com.design.patterns.behavioral.memento.shapes.Shape;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Editor {
    private List<Shape> state;

    public Editor() {
        this.state = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        state.add(shape);
    }

    public void delShape(Shape shape) {
        state.remove(shape);
    }

    public int getShapeCount() {
        return state.size();
    }

    public void printShapes() {
        for (Shape shape : state) {
            System.out.println(shape);
        }
    }

    public Memento save() {
        return new EditorMemento(backup(), state.size());
    }

    public void restore(Memento memento) {
        if (memento instanceof EditorMemento) {
            state = ((EditorMemento) memento).getState();
        }
    }

    private String backup() {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {

            for (Shape shape : state) {
                oos.writeObject(shape);
            }
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("Failed to backup state", e);
        }
    }

    public interface Memento {}

    private static final class EditorMemento implements Memento {

        private final String backup;
        private final int shapesCount;

        private EditorMemento(String backup, int shapesCount) {
            this.backup = backup;
            this.shapesCount = shapesCount;
        }

        private List<Shape> getState() {
            List<Shape> restoredShapes = new ArrayList<>();
            try (ObjectInputStream ois = new ObjectInputStream(
                    new ByteArrayInputStream(Base64.getDecoder().decode(backup)))) {

                for (int i = 0; i < shapesCount; i++) {
                    restoredShapes.add((Shape) ois.readObject());
                }
            } catch (ClassNotFoundException | IOException e) {
                throw new RuntimeException("Failed to restore memento", e);
            }
            return restoredShapes;
        }
    }
}
