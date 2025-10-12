package org.example;

public class DoubleClickButton{
    EventManager eventManager;
    private String eventType;

    public DoubleClickButton(String eventType) {
        this.eventManager = new EventManager(eventType);
        this.eventType = eventType;
    }
    public void doubleClick(){
        eventManager.notifyy(eventType);
    }

}
