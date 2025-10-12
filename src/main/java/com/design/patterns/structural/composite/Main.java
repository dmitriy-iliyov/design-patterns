package com.design.patterns.structural.composite;


public class Main {
    public static void main(String[] args) {
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        composite1.addComponent(new Element("name1"));
        composite1.addComponent(new Element("name2"));
        composite1.addComponent(new Element("name3"));
        composite1.addComponent(new Element("name4"));
        composite1.addComponent(new Element("name5"));
        composite1.calcArea();
        composite2.addComponent(new Element("name1"));
        composite2.addComponent(new Element("name2"));
        composite2.addComponent(new Element("name3"));
        composite2.calcArea();
        composite1.addComponent(composite2);
        composite1.calcArea();
    }
}