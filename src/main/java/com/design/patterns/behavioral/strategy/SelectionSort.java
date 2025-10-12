package com.design.patterns.behavioral.strategy;

public class SelectionSort implements Sort {
    @Override
    public void increase(int[] array) {
        for(int i = array.length - 1; i >= 0; i--){
            int max = array[i];
            int maxIndex = i;
            for(int j=0; j < i; j++) {
                if (max < array[j]){
                    max = array[j];
                    maxIndex = j;
                }
            }
            array[maxIndex] = array[i];
            array[i] = max;
        }
    }

    @Override
    public void decrease(int[] array) {
        for(int i = array.length - 1; i >= 0; i--){
            int min = array[i];
            int minIndex = i;
            for(int j=0; j < i; j++) {
                if (min > array[j]){
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
    }
}
