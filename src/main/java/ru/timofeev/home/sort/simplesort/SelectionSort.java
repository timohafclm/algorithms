package ru.timofeev.home.sort.simplesort;

import ru.timofeev.home.sort.Sort;

public class SelectionSort extends Sort {

    public SelectionSort(Long[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < elementsNumber - 1; i++) {
            int min = i;
            for (int j = i + 1; j < elementsNumber; j++)
                if (array[j] < array[min]) {
                    min = j;
                }
            swap(i, min);
        }
    }
}
