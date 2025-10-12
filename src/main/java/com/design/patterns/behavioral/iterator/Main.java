package org.example;

public class Main {
    public static void main(String[] args) {
        IntCollection intCollection = new IntCollection();
        Iterator iterator = intCollection.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getNext());
        }

        OrderedIntCollection orderedIntCollection = new OrderedIntCollection();
        Iterator orderedIterator = orderedIntCollection.getIterator();
        while (orderedIterator.hasNext()){
            System.out.println(orderedIterator.getNext());
        }
    }
}