package com.design.patterns.behavioral.observer;

public class Button {

    private EventManager eventManager;
    private String eventType;

    public Button(String eventType) {
        this.eventManager = new EventManager(eventType);
        this.eventType = eventType;
    }

    public void click(){
        eventManager.notifySubscribers(this.eventType);
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public String getEventType() {
        return eventType;
    }
}