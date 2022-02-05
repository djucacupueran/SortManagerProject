package com.spartaglobal.model;

import java.util.Random;

public class RandomArrayGenerator {
    public int[] generateArray(int size){
        Random rd = new Random();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = rd.nextInt();
        }
        System.out.println(arr);
        return arr;
    }
}
