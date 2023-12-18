package org.example;

public class MouseMoveHandler {
    private Component component;
    private MouseMoveHandler nextHandler;

    public MouseMoveHandler(Component component) {
        this.component = component;
    }

    public void setNextHandler(MouseMoveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleMouseMove() {
        component.handleMouseMove();
        if (nextHandler != null) {
            nextHandler.handleMouseMove();
        }
    }
}

