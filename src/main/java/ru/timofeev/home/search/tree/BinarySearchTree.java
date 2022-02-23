package ru.timofeev.home.search.tree;

import static java.util.Objects.isNull;

public class BinarySearchTree implements Tree<Integer, String> {

    private BinaryNode<Integer, String> root;

    public synchronized void insert(Integer key, String data) {
        var newNode = StringNode.builder().key(key).data(data).build();
        if (isNull(root)) {
            root = newNode;
        } else {
            insert(newNode);
        }
    }

    public String search(Integer key) {
        var currentNode = root;
        while (!currentNode.getKey().equals(key)) {
            if (key < currentNode.getKey()) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
            if (isNull(currentNode)) {
                return null;
            }
        }
        return currentNode.getData();
    }

    public boolean delete(Integer key) {
        return false;
    }

    private void insert(StringNode newNode) {
        var currentNode = root;
        while (true) {
            if (newNode.getKey() < currentNode.getKey()) {
                if (isNull(currentNode.getLeftChild())) {
                    currentNode.setLeftChild(newNode);
                    return;
                } else {
                    currentNode = currentNode.getLeftChild();
                }
            } else {
                if (isNull(currentNode.getRightChild())) {
                    currentNode.setRightChild(newNode);
                    return;
                } else {
                    currentNode = currentNode.getRightChild();
                }
            }
        }
    }
}
