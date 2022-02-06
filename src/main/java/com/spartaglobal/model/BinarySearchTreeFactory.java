package com.spartaglobal.model;

public class BinarySearchTreeFactory extends SortingFactory{

    @Override
    public Sort getInstance() {
        return new BinarySearchTree();
    }
}
