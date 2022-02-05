package com.spartaglobal.model;

import java.util.Arrays;

/// swap variableeeeee
///watch video min 30 TEST
public class BubbleSort implements Sort {
    public int[] sort(int[] array){

        if(array.length < 2){
            return null;
        }

        for(int i=0; i<array.length;i++){
            for(int j=1;j< array.length-i;j++){
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1]= array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("BUBBLEEEEEE");
        return array;
    }
}
