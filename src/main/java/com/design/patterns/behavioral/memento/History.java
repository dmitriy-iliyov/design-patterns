package com.design.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final Editor editor;
    private final List<Editor.Memento> editorMementos;

    public History(Editor editor) {
        this.editor = editor;
        this.editorMementos = new ArrayList<>();
    }

    public void saveBackup() {
        editorMementos.add(editor.save());
    }

    public void restoreBackup() {
        if (editorMementos.isEmpty()) {
            return;
        }
        Editor.Memento editorMemento = editorMementos.remove(editorMementos.size() - 1);
        editor.restore(editorMemento);
    }

    public boolean hasBackups() {
        return !editorMementos.isEmpty();
    }
}
