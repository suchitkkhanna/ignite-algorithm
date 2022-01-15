package com.ignite.algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PairWithSumInArrayTest {

    @Test
    public void test_case_1() {
        int[] result  = PairWithSumInArray.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);

        assertArrayEquals(new int[] {11, -1}, result);
    }

}
