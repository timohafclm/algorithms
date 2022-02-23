package ru.timofeev.home.sort.simplesort;

import ru.timofeev.home.sort.Sort;

public class BubbleSort extends Sort {

    public BubbleSort(Long[] array) {
        super(array);
    }

    @Override
    public void sort() {
        var out = elementsNumber - 1;
        for (int i = 0; i < elementsNumber - 1; i++) {
            for (int n = 0; n < out; n++) {
                if (array[n] > array[n + 1]) {
                    swap(n, n + 1);
                }
            }
            out--;
            for (int j = out; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(j, j - 1);
                }
            }
        }
    }
}
