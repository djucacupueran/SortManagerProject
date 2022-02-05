package com.spartaglobal.model;

public class BubbleFactory extends SortingFactory{
    @Override
    public Sort getInstance() {
        return new BubbleSort();
    }
}
