package com.spartaglobal.view;

import com.spartaglobal.controller.SortingController;
import com.spartaglobal.model.Sort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SortingView {

    private static Logger logger = LogManager.getLogger(SortingController.class.getSimpleName());


    public int getSortingAlgorithm(){
        System.out.println("\nPlease Enter number to select sorting option:\n" +
                            "|---------1. BubbleSort---------|\n" +
                            "|---------2. MergeSort----------|" +
                            "\n|---------3. BinarySearchTree---|" +
                            "\n|---------4. Exit---------------|\n");
        Scanner scanner = new Scanner(System.in);
        int desiredAlgorithm = scanner.nextInt();

        int[] options = {1,2,3,4}; //List of possible sorting options

        boolean validOption = !IntStream.of(options).anyMatch(x-> x == desiredAlgorithm);

        if(validOption){
            System.out.println("Invalid input, please try again");
            return getSortingAlgorithm();
        }

        return desiredAlgorithm;
    }



    public void displayResults(String result) {
        System.out.println("Sorted:   " + result);
    }
}
