package ru.timofeev.home.sort.effectivesort;

import ru.timofeev.home.sort.Sort;

public class MergeSort extends Sort {

    public MergeSort(Long[] array) {
        super(array);
    }

    @Override
    public void sort() {
        var workSpace = new Long[elementsNumber];
        var lowerBound = 0;
        var upperBound = array.length - 1;
        recursiveSort(workSpace, lowerBound, upperBound);
    }

    private void recursiveSort(Long[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound != upperBound) {
            var middle = (lowerBound + upperBound) / 2;
            recursiveSort(workSpace, lowerBound, middle);
            recursiveSort(workSpace, middle + 1, upperBound);
            merge(workSpace, lowerBound, middle, upperBound);
        }
    }

    private void merge(Long[] array, int lowerBound, int middle, int upperBound) {
    }
}
