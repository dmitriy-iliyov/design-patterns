package org.example;


public class Main {
    public static void main(String[] args) {
        Sort sort = new BubbleSort();
        Collection collection = new Collection(20);
        collection.setSort(sort);
        collection.printArray();
        collection.sortArray(true);
        collection.printArray();
        collection.sortArray(false);
        collection.printArray();
        Sort sort1 = new SelectionSort();
        collection.setSort(sort1);
        collection.printArray();
        collection.sortArray(true);
        collection.printArray();
        collection.sortArray(false);
        collection.printArray();
        Sort sort2 = new ShellSort();
        collection.setSort(sort2);
        collection.printArray();
        collection.sortArray(true);
        collection.printArray();
        collection.sortArray(false);
        collection.printArray();
        Sort sort3 = new InserSort();
        collection.setSort(sort3);
        collection.printArray();
        collection.sortArray(true);
        collection.printArray();
        collection.sortArray(false);
        collection.printArray();
    }
}