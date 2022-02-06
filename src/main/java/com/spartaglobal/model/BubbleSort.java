package com.spartaglobal.model;

import java.util.Arrays;

public class BubbleSort implements Sort {
    public int[] sort(int[] array){

        //Return null if array is equal to null
        if(array == null){
            return null;
        }

        //Return array if array has no enough elements to be sorted
        if(array.length < 2){
            return array;
        }
        //Iterate through array and swap elements when needed
        for(int i=0; i<array.length;i++){
            for(int j=1;j< array.length-i;j++){
                if(array[j-1]>array[j]){

                    //swap elements
                    int temp = array[j-1];
                    array[j-1]= array[j];
                    array[j] = temp;
                }
            }
        }
        //return sorted array
        return array;
    }
}
