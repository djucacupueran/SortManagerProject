package com.spartaglobal;

import com.spartaglobal.controller.SortingController;
import com.spartaglobal.view.SortingView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryMain {
    private static Logger logger = LogManager.getLogger(FactoryMain.class.getSimpleName());

    public static void main(String[] args) {

        logger.info("Sort Manager initiated");
        SortingController controller = new SortingController();
        SortingView view  = new SortingView();
        int desiredAlgorithm = view.getSortingAlgorithm();
        String result = controller.sortArray(desiredAlgorithm);
        view.displayResults(result);
    }
}
