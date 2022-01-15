package com.ignite.algoexpert;

import java.util.*;

public class PairWithSumInArray {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        for(int i = 0 ; i< array.length; i++) {
            table.put(array[i], i);
        }
        for(int i = 0 ; i < array.length; i++) {
            int y = targetSum - array[i];
            Integer result = table.get(y);
            if(result != null && result.intValue() != i) {
                return new int[] {array[i], array[result.intValue()]};
            }
        }
        return new int[0];
    }
}
