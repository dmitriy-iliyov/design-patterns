package com.design.patterns.behavioral.strategy;

public class InserSort implements Sort {
    @Override
    public void increase(int[] array) {
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

    @Override
    public void decrease(int[] array) {
        for(int i = 1; i < array.length; i++){
            int ai = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < ai) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = ai;
        }
    }
}
