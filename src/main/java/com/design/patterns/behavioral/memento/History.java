package org.example;

import org.example.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<Memento> mementos ;

    public History(){
        this.mementos = new ArrayList<>();
    }

    public void saveBackup(Memento memento){
        mementos.add(memento);
    }

    public List<Shape> restoreBackup(){
        return mementos.get(mementos.size() - 1).restore();
    }
}
