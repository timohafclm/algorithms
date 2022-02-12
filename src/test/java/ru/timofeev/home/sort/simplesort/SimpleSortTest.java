package ru.timofeev.home.sort.simplesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleSortTest {

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

    private void assertSort(Long[] array) {
        assertEquals(4, array.length);
        assertEquals(3L, array[0]);
        assertEquals(49L, array[1]);
        assertEquals(54L, array[2]);
        assertEquals(75L, array[3]);
    }

    private Long[] givenArray() {
        return new Long[]{75L, 49L, 3L, 54L};
    }
}