package com.design.patterns.structural.flyweight;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {

    private static Map<String, Color> colors = new HashMap<>();

    public static Color getColor(String name) {
        Color color = colors.get(name.toLowerCase());
        if (color == null) {
            color = Color.valueOf(name.toUpperCase());
            colors.put(name.toLowerCase(), color);
        }
        return color;
    }
}
