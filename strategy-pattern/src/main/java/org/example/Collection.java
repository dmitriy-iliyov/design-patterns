package org.example;

import java.util.HashMap;
import java.util.Map;

public class Collection {
    private Map<String, Sort> sortsMap;
    private int [] array;
    private int count;

    public Collection(int count) {
        this.sortsMap = new HashMap<>();
        this.sortsMap.put("bubble", new BubbleSort());
        this.sortsMap.put("insert", new InserSort());
        this.sortsMap.put("shell", new ShellSort());
        this.sortsMap.put("selection", new SelectionSort());
        this.count = count;
        this.array = getRandomArray();
    }

    public void sortArray(String sortKey, int leastOrMax){
        if (leastOrMax == 1)
            sortsMap.get(sortKey).sortLeastToMax(this.array);
        else if( leastOrMax == 0)
            sortsMap.get(sortKey).sortMaxToLeast(this.array);
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
}
