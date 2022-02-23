package ru.timofeev.home.search.binarysearch;

import ru.timofeev.home.search.binarysearch.CommonBinarySearch;

public class RecursionBinarySearch extends CommonBinarySearch {

    public RecursionBinarySearch(Long[] array) {
        super(array);
    }

    @Override
    public int search(Long key) {
        int lowerBound = 0;
        int upperBound = sortedArray.length - 1;
        return search(key, lowerBound, upperBound);
    }

    private int search(Long key, int lowerBound, int upperBound) {
        int cursor = (lowerBound + upperBound) / 2;
        if (sortedArray[cursor].equals(key)) {
            return cursor;
        } else if (lowerBound > upperBound) {
            return -1;
        } else if (key.compareTo(sortedArray[cursor]) < 0) {
            upperBound = cursor - 1;
            return search(key, lowerBound, upperBound);
        } else {
            lowerBound = cursor + 1;
            return search(key, lowerBound, upperBound);
        }
    }
}
