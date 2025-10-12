package com.design.patterns.behavioral.chain_of_responsibility;

public interface Handler {
    void setNext(Handler nextHandler);
    void handle(String request);
}
