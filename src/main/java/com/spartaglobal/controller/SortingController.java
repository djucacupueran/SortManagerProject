package com.spartaglobal.controller;

import com.spartaglobal.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SortingController {

    private static Logger logger = LogManager.getLogger(SortingController.class.getSimpleName());

    public String sortArray(int sortingMethod) {
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

    public static Sort getSorted(int sortingMethod) {
        SortingFactory sf = null;

        switch (sortingMethod){
            case 1 -> {
                logger.info("User chose Bubble sort to sort the array");
                sf = new BubbleFactory();}
            case 2 -> {
                logger.info("User chose Merge sort to sort the array");
                sf = new MergeFactory();
            }
            case 3 -> {
                logger.info("User chose Binary Search Tree to sort the array");
                sf = new BinarySearchTreeFactory();
            }
            case 4 -> {
                logger.info(("User exit the program,"));
                System.out.println("Goodbye!");
                System.exit(0);
            }
            default -> {
                sf = null;
            }
        };
        return sf.getInstance();
    }
}
