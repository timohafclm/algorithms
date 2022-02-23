package ru.timofeev.home;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelper {

    public static Long[] givenArray() {
        return new Long[]{75L, 49L, 3L, 54L};
    }

    public static void assertSort(Long[] array) {
        assertEquals(4, array.length);
        assertEquals(3L, array[0]);
        assertEquals(49L, array[1]);
        assertEquals(54L, array[2]);
        assertEquals(75L, array[3]);
    }
}
