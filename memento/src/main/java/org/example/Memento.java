package org.example;

import org.example.shapes.Shape;

import java.util.List;

public class Memento {
    private Editor editor;
    private byte [] backup;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public List<Shape> restore(){
        return editor.restore(backup);
    }
}
