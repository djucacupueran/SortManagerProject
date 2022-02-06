package com.spartaglobal.view;

import java.util.Scanner;

public class SortingView {
    public String getSortingAlgorithm(){
        System.out.println("Enter bubble or merge");
        Scanner scanner = new Scanner(System.in);
        String desiredAlgorithm = scanner.next();
        return desiredAlgorithm;
    }

    public void displayResults(String result) {
        System.out.println("Sorted:   " + result);
    }
}
