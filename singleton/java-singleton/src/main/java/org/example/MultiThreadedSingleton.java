package org.example;

public class MultiThreadedSingleton {
    private static volatile MultiThreadedSingleton instance;
    public String value;
    private MultiThreadedSingleton(String value){
        this.value = value;
    }
    public static MultiThreadedSingleton getInstance(String value){
        MultiThreadedSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(MultiThreadedSingleton.class) {
            if (instance == null) {
                instance = new MultiThreadedSingleton(value);
            }
            return instance;
        }
    }
}
