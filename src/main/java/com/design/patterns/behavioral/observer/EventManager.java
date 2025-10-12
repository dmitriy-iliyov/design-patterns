package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EventManager {
    private Map<String, List<EventListener>> eventListeners;

    public EventManager(String... operations){
        eventListeners = new HashMap<>();
        for (String operation : operations) {
            this.eventListeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener){
        List<EventListener> listeners = eventListeners.get(eventType);
        if (!listeners.contains(listener)) listeners.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener){
        List<EventListener> listeners = eventListeners.get(eventType);
        if (listeners.contains(listener)) listeners.remove(listener);
    }

    public void notifyy(String eventType){
        for (EventListener listener: eventListeners.get(eventType)){
            listener.update();
        }
    }
}
