package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("476");
        Singleton thecondSingleton = Singleton.getInstance("753");
        System.out.println(singleton.value);
        System.out.println(thecondSingleton.value);
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            MultiThreadedSingleton singleton = MultiThreadedSingleton.getInstance("476");
            System.out.println(singleton.value);
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            MultiThreadedSingleton singleton = MultiThreadedSingleton.getInstance("753");
            System.out.println(singleton.value);
        }
    }
}