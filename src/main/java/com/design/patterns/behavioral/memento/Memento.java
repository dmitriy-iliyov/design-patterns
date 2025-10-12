package com.design.patterns.behavioral.memento;

import com.design.patterns.behavioral.memento.shapes.Shape;

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
