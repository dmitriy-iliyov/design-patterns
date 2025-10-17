package com.design.patterns.behavioral.observer;

public class DoubleClickButton {

    private EventManager eventManager;
    private String eventType;

    public DoubleClickButton(String eventType) {
        this.eventManager = new EventManager(eventType);
        this.eventType = eventType;
    }

    public void doubleClick(){
        eventManager.notifySubscribers(eventType);
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public String getEventType() {
        return eventType;
    }
}
