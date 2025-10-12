package org.example;

public class OrderedIntCollection extends IntCollection {

    public OrderedIntCollection() {
        super();
        insertSort(array);
        printArray(array, count);
    }

    public static void insertSort(int [] array){
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0 && array[j-1] > array[j]; j--){
                int tmp = array[j-1];
                array[j-1] = array[j];
                array[j] = tmp;
            }
        }
    }
}
