package com.spartaglobal.model;

import java.util.Arrays;

/// swap variableeeeee
///watch video min 30 TEST
public class BubbleSort implements Sort {
    public static void main(String[] args) {
        BubbleSort a = new BubbleSort();
        int[] test = {3,60,35,2,45,320,5};
        System.out.println(Arrays.toString(a.sort(test)));
    }

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
        return array;
    }
}
