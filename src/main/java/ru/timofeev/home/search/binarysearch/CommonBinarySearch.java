package ru.timofeev.home.search.binarysearch;

import java.util.stream.Stream;

public abstract class CommonBinarySearch {

    protected final Long[] sortedArray;

    public CommonBinarySearch(Long[] array) {
        sortedArray = Stream.of(array).sorted().toArray(Long[]::new);
    }

    public abstract int search(Long key);
}
