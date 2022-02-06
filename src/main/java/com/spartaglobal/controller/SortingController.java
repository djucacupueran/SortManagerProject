package com.spartaglobal.controller;

import com.spartaglobal.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SortingController {

    private static Logger logger = LogManager.getLogger(SortingController.class.getSimpleName());

    public String sortArray(String sortingMethod) {
        Sort s = getSorted(sortingMethod);
        //Create random array of size entered by the user
        System.out.println("Enter random array size");
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        RandomArrayGenerator r = new RandomArrayGenerator();
        int[] userArray = r.generateArray(arraySize);
        logger.info("User created random array of size " + arraySize );
        //Print original unsorted array
        System.out.println(("Original: " + Arrays.toString(userArray)));

        return Arrays.toString(s.sort(userArray));
    }

    public static Sort getSorted(String sortingMethod) {
        SortingFactory sf = null;

        switch (sortingMethod.toLowerCase()){
            case "bubble" -> {
                logger.info("User chose Bubble sort to sort the array");
                sf = new BubbleFactory();}
            case "merge" -> {
                logger.info("User chose Merge sort to sort the array");
                sf = new MergeFactory();
            }
            case "bst" -> {
                logger.info("User chose Binary Search Tree to sort the array");
                sf = new BinarySearchTreeFactory();
            }
            default -> sf = null;

        };
        return sf.getInstance();
    }
}
