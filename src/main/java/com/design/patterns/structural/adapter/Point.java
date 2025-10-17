package com.design.patterns.structural.adapter;

public class Point implements Pointable {

    private int X;
    private int Y;

    @Override
    public void setX(int x) {
        this.X = x;
    }

    @Override
    public void setY(int y) {
        this.Y = y;
    }

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return Y;
    }
}
