package com.design.patterns.structural.adapter;

public class AdapterExample {
    public static void main(String[] args) {
        Point a = new Point();
        a.setX(2);
        a.setY(3);
        CircleAdapter circleAdapter = new CircleAdapter(5, a);
        circleAdapter.draw();
    }
}