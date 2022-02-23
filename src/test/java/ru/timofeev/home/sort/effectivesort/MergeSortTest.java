package ru.timofeev.home.sort.effectivesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.timofeev.home.TestHelper.assertSort;
import static ru.timofeev.home.TestHelper.givenArray;

class MergeSortTest {

    @Test
    void sort(){
        var mergeSort = new MergeSort(givenArray());

        mergeSort.sort();

        assertSort(mergeSort.getArray());
    }
}