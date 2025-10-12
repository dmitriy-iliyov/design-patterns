package com.design.patterns.behavioral.iterator;

public class OrderedIntCollection extends IntCollection {

    public OrderedIntCollection() {
        super();
        insertSort(array);
        printArray(array, count);
    }

    public static void insertSort(int [] array){
        for(int i = 1; i < array.length; i++){
            int ai = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > ai) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = ai;
        }
    }
}
