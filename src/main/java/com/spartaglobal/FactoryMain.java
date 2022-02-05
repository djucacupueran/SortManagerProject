package com.spartaglobal;

import com.spartaglobal.controller.SortingController;

public class FactoryMain {
    public static void main(String[] args) {
        SortingController s = new SortingController();
        System.out.println(s.sortArray("bubble"));
    }
}
