package org.example;


public class Main {
    public static void main(String[] args) {
//        bubble insert shell selection

        Collection collection = new Collection(20);
        collection.sortArray("insert", 1);
        collection.printArray();
        collection.sortArray("insert", 0);
        collection.printArray();
        collection.sortArray("bubble", 1);
        collection.printArray();
    }
}