package com.design.patterns.generating.singleton;


public class DefaultLazySingleton {

    private static DefaultLazySingleton INSTANCE;

    private DefaultLazySingleton() {}

    public static DefaultLazySingleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new DefaultLazySingleton();
        }
        return INSTANCE;
    }
}
