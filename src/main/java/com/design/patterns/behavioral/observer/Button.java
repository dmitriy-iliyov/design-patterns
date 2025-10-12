package com.design.patterns.behavioral.observer;

public class Button {

    public EventManager eventManager;
    private String eventType;

    public Button(String eventType) {
        this.eventManager = new EventManager(eventType);
        this.eventType = eventType;
    }

    public void click(){
        eventManager.notifySubscribers(this.eventType);
    }
}
