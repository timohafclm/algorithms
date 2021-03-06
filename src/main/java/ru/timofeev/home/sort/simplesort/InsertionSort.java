package ru.timofeev.home.sort.simplesort;

import ru.timofeev.home.sort.Sort;

public class InsertionSort extends Sort {

    public InsertionSort(Long[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 1; i < elementsNumber; i++) {
            var temp = array[i];
            int cursor = i;
            while (cursor > 0 && array[cursor - 1] > temp) {
                array[cursor] = array[cursor - 1];
                cursor--;
            }
            array[cursor] = temp;
        }
    }
}
