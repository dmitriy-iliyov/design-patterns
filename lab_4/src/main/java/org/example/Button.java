package org.example;

public class Button{
    public EventManager eventManager;
    private String eventType;

    public Button(String eventType) {
        this.eventManager = new EventManager(eventType);
        this.eventType = eventType;
    }

    public void click(){
        eventManager.notifyy(this.eventType);
    }
}
