package ru.timofeev.home.search.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BinarySearchTreeTest {

    @Test
    void search() {
        var tree = givenTree();

        assertEquals("five", tree.search(5));
        assertEquals("ten", tree.search(10));
        assertEquals("four", tree.search(4));
        assertEquals("eight", tree.search(8));
        assertNull(tree.search(15));
    }

    private Tree<Integer, String> givenTree() {
        var tree = new BinarySearchTree();
        tree.insert(5, "five");
        tree.insert(10, "ten");
        tree.insert(4, "four");
        tree.insert(8, "eight");
        return tree;
    }
}