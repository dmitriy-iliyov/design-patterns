package org.example;

public class InserSort implements Sort{
    @Override
    public void sortLeastToMax(int[] array) {
        for (int i = 1; i < array.length; i++){
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--){
                int tmp = array[j - 1];
                array[j -1] = array[j];
                array[j] = tmp;
            }
        }
    }

    @Override
    public void sortMaxToLeast(int[] array) {
        for (int i = 1; i < array.length; i++){
            for (int j = i; j > 0 && array[j - 1] < array[j]; j--){
                int tmp = array[j - 1];
                array[j -1] = array[j];
                array[j] = tmp;
            }
        }
    }
}
