package com.ignite.algoexpert;

import java.util.List;

public class ValidateArraySubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIdx = 0;
        for(int idx = 0 ; idx < array.size(); idx++) {
            if(seqIdx == sequence.size())
                break;

            if(sequence.get(idx).equals(array.get(idx)))
                seqIdx++;
        }
        return seqIdx == sequence.size();
    }
}
