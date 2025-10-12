package org.example;

public class StaticNonLazySingleton {

    private static StaticNonLazySingleton INSTANCE = new StaticNonLazySingleton();


    private StaticNonLazySingleton() {

    }

    public static StaticNonLazySingleton getInstance() {
        return INSTANCE;
    }
}
