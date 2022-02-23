package ru.timofeev.home.search.binarysearch;

public class BinarySearch extends CommonBinarySearch {

    public BinarySearch(Long[] array) {
        super(array);
    }

    @Override
    public int search(Long key) {
        int lowerBound = 0;
        int upperBound = sortedArray.length - 1;
        int cursor;
        while (true) {
            cursor = (lowerBound + upperBound) / 2;
            if (sortedArray[cursor].equals(key)) {
                return cursor;
            } else if (lowerBound > upperBound) {
                return -1;
            } else if (key.compareTo(sortedArray[cursor]) < 0) {
                upperBound = cursor - 1;
            } else {
                lowerBound = cursor + 1;
            }
        }
    }
}
