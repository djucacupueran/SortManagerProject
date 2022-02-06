package com.spartaglobal.model;

import java.util.Arrays;
import java.util.Random;

public class MergeSort implements Sort{

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){

        //Sort arrays based on smaller arrays
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize) {
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    @Override
    public int[] sort(int[] inputArray) {

        if(inputArray == null){
            return null;
        }

        int inputLength = inputArray.length;

        //Return Array if not enough elements to sort it
        if(inputLength < 2){
            return inputArray;
        }

        //calculates mid element in array to divide it into left an right array
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        //adds corresponding elements of original array to left and right arrays
        for(int i=0; i< midIndex; i++){
            leftHalf[i] = inputArray[i];
        }
        for(int i=midIndex; i < inputLength; i++){
            rightHalf[i-midIndex] = inputArray[i];
        }

        //Calls itself to keep dividing into smaller arrays until arrays of size 1
        sort(leftHalf);
        sort(rightHalf);

        //Calls merge to sort small arrays into bigger ones
        merge(inputArray, leftHalf, rightHalf);
        return inputArray;
    }
}
