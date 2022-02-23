package ru.timofeev.home.sort;

import java.util.Arrays;

public abstract class Sort {

    protected final Long[] array;
    protected final int elementsNumber;

    public Sort(Long[] array) {
        this.array = array;
        this.elementsNumber = array.length;
    }

    public abstract void sort();

    protected void swap(int one, int two) {
        if (one != two) {
            var temp = array[one];
            array[one] = array[two];
            array[two] = temp;
        }
    }

    public Long[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "SimpleSort{" + "array=" + Arrays.toString(array) + '}';
    }
}
