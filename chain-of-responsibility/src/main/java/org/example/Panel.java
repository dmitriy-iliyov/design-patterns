package org.example;

import java.util.ArrayList;
import java.util.List;

public class Panel implements Component{
    List<Component> panelList;

    public Panel() {
        this.panelList = new ArrayList<>();
    }

    public void addComponent(Component button){
        this.panelList.add(button);
    }

    @Override
    public void handleMouseMove() {
        System.out.println("Mouse moving om panel...");
        for(Component component : panelList)
            component.handleMouseMove();
    }
}
