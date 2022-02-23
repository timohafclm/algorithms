package ru.timofeev.home.search;

import org.junit.jupiter.api.Test;
import ru.timofeev.home.search.binarysearch.BinarySearch;
import ru.timofeev.home.search.binarysearch.RecursionBinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonBinarySearchTest {

    @Test
    void binarySearch() {
        var binary = new BinarySearch(givenArray());

        var index = binary.search(34L);

        assertEquals(1, index);
    }

    @Test
    void recursiveBinarySearch() {
        var recursive = new RecursionBinarySearch(givenArray());

        var index = recursive.search(67L);

        assertEquals(2, index);
    }

    private Long[] givenArray() {
        return new Long[]{67L, 34L, 3L, 76L};
    }
}