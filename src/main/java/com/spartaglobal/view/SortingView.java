package com.spartaglobal.view;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SortingView {
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
