package ru.timofeev.home.search.tree;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StringNode implements BinaryNode<Integer, String> {

    private Integer key;
    private String data;
    private BinaryNode<Integer, String> leftChild;
    private BinaryNode<Integer, String> rightChild;
}
