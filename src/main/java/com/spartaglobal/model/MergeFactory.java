package com.spartaglobal.model;

public class MergeFactory extends SortingFactory{

    @Override
    public Sort getInstance() {
        return new MergeSort();
    }
}
