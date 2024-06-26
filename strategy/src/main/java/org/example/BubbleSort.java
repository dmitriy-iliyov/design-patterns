package org.example;

public class BubbleSort implements Sort {
    @Override
    public void sortLeastToMax(int [] array) {
        for( int i = 0; i < array.length; i++) {
            for(int j = array.length-1; j > i; j-- ) {
                if ( array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    @Override
    public void sortMaxToLeast(int[] array) {
        for( int i = 0; i < array.length; i++) {
            for(int j = array.length-1; j > i; j-- ) {
                if ( array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
