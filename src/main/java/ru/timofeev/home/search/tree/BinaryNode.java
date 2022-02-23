package ru.timofeev.home.search.tree;

public interface BinaryNode<T, K> {

    T getKey();

    K getData();

    BinaryNode<T, K> getLeftChild();

    BinaryNode<T, K> getRightChild();

    void setLeftChild(BinaryNode<T, K> newNode);

    void setRightChild(BinaryNode<T, K> newNode);
}
