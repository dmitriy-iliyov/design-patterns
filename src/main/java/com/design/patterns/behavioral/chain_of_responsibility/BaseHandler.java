package com.design.patterns.behavioral.chain_of_responsiblity;

public class BaseHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(String request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}

