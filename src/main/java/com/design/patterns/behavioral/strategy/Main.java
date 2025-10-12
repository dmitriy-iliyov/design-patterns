package com.design.patterns.behavioral.strategy;


public class Main {
    public static void main(String[] args) {
        Sort sort = new BubbleSort();
        CollectionWrapper collectionWrapper = new CollectionWrapper(20);
        collectionWrapper.setSort(sort);
        collectionWrapper.printArray();
        collectionWrapper.sortArray(true);
        collectionWrapper.printArray();
        collectionWrapper.sortArray(false);
        collectionWrapper.printArray();
        Sort sort1 = new SelectionSort();
        collectionWrapper.setSort(sort1);
        collectionWrapper.printArray();
        collectionWrapper.sortArray(true);
        collectionWrapper.printArray();
        collectionWrapper.sortArray(false);
        collectionWrapper.printArray();
        Sort sort2 = new ShellSort();
        collectionWrapper.setSort(sort2);
        collectionWrapper.printArray();
        collectionWrapper.sortArray(true);
        collectionWrapper.printArray();
        collectionWrapper.sortArray(false);
        collectionWrapper.printArray();
        Sort sort3 = new InserSort();
        collectionWrapper.setSort(sort3);
        collectionWrapper.printArray();
        collectionWrapper.sortArray(true);
        collectionWrapper.printArray();
        collectionWrapper.sortArray(false);
        collectionWrapper.printArray();
    }
}