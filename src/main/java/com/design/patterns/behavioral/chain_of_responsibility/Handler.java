package com.design.patterns.behavioral.chain_of_responsiblity;

public interface Handler {
    void setNext(Handler nextHandler);
    void handle(String request);
}
