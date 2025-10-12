package com.design.patterns.generating.singleton;

public class StaticHolderLazySingleton {

    private StaticHolderLazySingleton() {}

    private static class InstanceHolder {
        private final static StaticHolderLazySingleton INSTANCE = new StaticHolderLazySingleton();
    }

    public static StaticHolderLazySingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
