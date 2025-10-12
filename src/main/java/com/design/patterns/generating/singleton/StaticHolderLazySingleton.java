package org.example;

import java.util.UUID;

public class BillPughLazySingleton {

    private String data;


    private BillPughLazySingleton() {
        this.data = UUID.randomUUID().toString();
    }

    private static class InstanceHolder {
        private final static BillPughLazySingleton INSTANCE = new BillPughLazySingleton();
    }

    public static BillPughLazySingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public String getData() {
        return this.data;
    }

}
