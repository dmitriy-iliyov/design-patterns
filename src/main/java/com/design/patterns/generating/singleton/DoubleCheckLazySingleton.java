package org.example;

public class DoubleCheckedLazySingleton {

    private static volatile DoubleCheckedLazySingleton instance;
    public String value;

    private DoubleCheckedLazySingleton(String value){
        this.value = value;
    }

    public static DoubleCheckedLazySingleton getInstance(String value){
        DoubleCheckedLazySingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(DoubleCheckedLazySingleton.class) {
            if (instance == null) {
                instance = new DoubleCheckedLazySingleton(value);
            }
            return instance;
        }
    }
}
