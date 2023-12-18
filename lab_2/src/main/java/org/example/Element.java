package org.example;

public class Element implements Component {
    private String name;
    private final int x;
    private final int y;

    public Element(String name) {
        this.name = name;
        this.x = (int)(1 + Math.random()*100);
        this.y = (int)(1 + Math.random()*100);
    }

    @Override
    public int calcArea() {
        System.out.println("Method draw with parametrs x = " + this.x + " y = " + this.y);
        return this.x + this.y;
    }

    @Override
    public String toString(){
        return "Element{ name: "+ this.name + ", x: "+ this.x +", y: " + this.y+" }";
    }
}
