package org.example;


public class Collection {
    private Sort sort;
    private int [] array;
    private int count;

    public Collection(int count) {
        this.count = count;
        this.array = getRandomArray();
    }

    public void sortArray(boolean leastOrMax){
        if (leastOrMax)
            sort.sortLeastToMax(this.array);
        else
            sort.sortMaxToLeast(this.array);
    }

    private int [] getRandomArray(){
        int [] _array = new int[this.count];
        for (int i = 0; i < this.count; i++){
            _array[i] = (int)(Math.random()*100);
        }
        return _array;
    }

    public void printArray(){
        for (int i = 0; i < this.count; i++){
            System.out.print(this.array[i] + "; ");
        }
        System.out.println(" ");
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
