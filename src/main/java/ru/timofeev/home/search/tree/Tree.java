package ru.timofeev.home.search.tree;

public interface Tree<T, K> {

    void insert(T key, K data);

    K search(T key);

    boolean delete(T key);
}
