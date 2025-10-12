package org.example;

public class Main {
    public static void main(String[] args) {
        TCP tcp = new TCP();
        UI ui = new UI(tcp);
        ui.init();
    }
}