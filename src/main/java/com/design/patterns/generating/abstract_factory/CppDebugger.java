package com.design.patterns.generating.abstract_factory;

public class CppDebugger implements Debugger {
    @Override
    public void debug() {
        System.out.println("Debugging c++...");
    }
}
