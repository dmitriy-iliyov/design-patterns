package org.example;

import org.example.shapes.Shape;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Memento {

    private final Editor editor;
    private final String backup;
    private final int shapesCount;

    public Memento(Editor editor, int shapesCount) {
        this.editor = editor;
        this.backup = editor.backup();
        this.shapesCount = shapesCount;
    }

    public List<Shape> restore(){
        return editor.restore(backup, shapesCount);
    }
}
