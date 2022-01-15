package com.ignite.algoexpert;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        for(int i = 0; i <array.length; i++) {
            array[i] = array[i]* array[i];
        }
        return new int[] {};
    }
}
