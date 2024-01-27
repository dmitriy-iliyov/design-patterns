package org.example;


public class Main {
    public static void main(String[] args) {
        Button button = new Button("click");
        button.eventManager.subscribe("click", new Window("win1"));
        button.click();
        DoubleClickButton doubleClickButton = new DoubleClickButton("double-click");
        doubleClickButton.eventManager.subscribe("double-click", new TextArea("A"));
        doubleClickButton.doubleClick();
    }
}