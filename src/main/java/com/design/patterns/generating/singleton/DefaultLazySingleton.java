package org.example;


public class DefaultLazySingleton {

    private static DefaultLazySingleton instance;
    public String value;

    private DefaultLazySingleton(String value){
        this.value = value;
    }

    public static DefaultLazySingleton getInstance(String value){
        if(instance == null){
            instance = new DefaultLazySingleton(value);
        }
        return instance;
    }
}
