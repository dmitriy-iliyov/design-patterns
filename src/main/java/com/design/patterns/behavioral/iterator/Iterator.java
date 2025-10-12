package com.design.patterns.behavioral.iterator;

public interface Iterator {
    boolean hasNext();
    int getNext();
    void reset();
}
