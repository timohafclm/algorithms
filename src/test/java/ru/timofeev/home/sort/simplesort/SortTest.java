package ru.timofeev.home.sort.simplesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.timofeev.home.TestHelper.assertSort;
import static ru.timofeev.home.TestHelper.givenArray;

class SortTest {

    @Test
    void bubbleSort() {
        var bubble = new BubbleSort(givenArray());

        bubble.sort();

        assertSort(bubble.getArray());
    }

    @Test
    void selectionSort() {
        var selection = new SelectionSort(givenArray());

        selection.sort();

        assertSort(selection.getArray());
    }

    @Test
    void insertionSort() {
        var insertion = new InsertionSort(givenArray());

        insertion.sort();

        assertSort(insertion.getArray());
    }
}