package org.example;

public class Button implements Component{
    private int x;
    private int y;

    public Button(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void handleMouseMove() {
        System.out.println("Mouse moving on x = " + this.x + "; y =  "+ this.y +";");
    }
}
