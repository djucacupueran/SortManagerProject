package com.spartaglobal;

import com.spartaglobal.controller.SortingController;
import com.spartaglobal.view.SortingView;

public class FactoryMain {
    public static void main(String[] args) {
        SortingController controller = new SortingController();
        SortingView view  = new SortingView();
        String desiredAlgorithm = view.getSortingAlgorithm();
        String result = controller.sortArray(desiredAlgorithm);
        view.displayResults(result);
    }
}
