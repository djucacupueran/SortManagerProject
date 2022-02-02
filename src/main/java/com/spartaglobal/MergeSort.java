package com.spartaglobal;

import java.util.Arrays;
import java.util.Random;

public class MergeSort implements Sort{
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[11];
        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt(-100,200);
        }
        System.out.println(Arrays.toString(a));
        MergeSort b = new MergeSort();
        b.sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
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
        int inputLength = inputArray.length;

        if(inputLength < 2){
            return inputArray;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for(int i=0; i< midIndex; i++){
            leftHalf[i] = inputArray[i];
        }
        for(int i=midIndex; i < inputLength; i++){
            rightHalf[i-midIndex] = inputArray[i];
        }

        sort(leftHalf);
        sort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
        return inputArray;
    }
}
