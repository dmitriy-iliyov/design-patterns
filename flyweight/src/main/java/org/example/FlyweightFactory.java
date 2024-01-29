package org.example;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String, LineFlyweight> flyweights = new HashMap<>();

    public static LineFlyweight getLineFlyweight(String name, Color color){
        LineFlyweight resultFlyweight = flyweights.get(name);
        if (resultFlyweight == null){
            resultFlyweight = new LineFlyweight(name, color);
            flyweights.put(name, resultFlyweight);
        }
        return resultFlyweight;
    }

}

