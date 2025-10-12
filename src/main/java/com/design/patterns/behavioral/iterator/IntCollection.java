package com.design.patterns.behavioral.iterator;

public class IntCollection implements IterableCollection {
    protected int[] array;
    protected int count = 20;

    public IntCollection() {
        this.array = getRandomArray(count);
        printArray(array, count);
    }

    @Override
    public Iterator getIterator() {
        return new SimpleIterator();
    }

    private class SimpleIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public int getNext() {
            if(!hasNext())
                return 0;
            return array[index++];
        }

        @Override
        public void reset() {
            index = 0;
        }
    }

    private static int [] getRandomArray(int count) {
        int [] _array = new int[count];
        for (int i = 0; i < count; i++){
            _array[i] = (int)(Math.random()*100);
        }
        return _array;
    }

    public static void printArray(int [] array, int count) {
        for (int i = 0; i < count; i++){
            System.out.print(array[i] + "; ");
        }
        System.out.println(" ");
    }
}
