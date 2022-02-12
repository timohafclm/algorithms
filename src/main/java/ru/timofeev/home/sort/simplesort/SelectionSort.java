package ru.timofeev.home.sort.simplesort;

public class SelectionSort extends SimpleSort{

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
