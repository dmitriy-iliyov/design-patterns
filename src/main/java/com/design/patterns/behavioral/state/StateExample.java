package com.design.patterns.behavioral.state;

public class StateExample {
    public static void main(String[] args) {
        TCP tcp = new TCP();
        UI ui = new UI(tcp);
        ui.init();
    }
}