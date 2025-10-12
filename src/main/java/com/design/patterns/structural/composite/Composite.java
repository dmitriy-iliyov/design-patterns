package com.design.patterns.structural.composite;

import java.util.ArrayList;

public class Composite implements Component{
    private ArrayList<Component> components;
    private int area;

    public Composite() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public Component getComponent(int index) {
        System.out.println(components.get(index));
        return components.get(index);
    }

    @Override
    public int calcArea() {
        if (this.area != 0){
            this.area = 0;
        }
        for(Component component : components){
            this.area += component.calcArea();
        }
        System.out.println(this.area);
        return this.area;
    }
}
