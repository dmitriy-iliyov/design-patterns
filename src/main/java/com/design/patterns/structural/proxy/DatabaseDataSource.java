package com.design.patterns.structural.proxy;

public class DatabaseDataSource implements DataSource {

    @Override
    public String getData(String key) {
        simulateSlowQuery();
        return "Database data for key: " + key;
    }

    private void simulateSlowQuery() {
        try {
            System.out.println("Connecting to the database...");
            Thread.sleep(1500);
        } catch (InterruptedException ignored) {}
    }
}
