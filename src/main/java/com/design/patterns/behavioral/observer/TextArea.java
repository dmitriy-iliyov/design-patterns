package com.design.patterns.behavioral.observer;

public class TextArea implements EventListener{

    String name;

    public TextArea(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("TextArea " + this.name + " is increases");
    }
}
