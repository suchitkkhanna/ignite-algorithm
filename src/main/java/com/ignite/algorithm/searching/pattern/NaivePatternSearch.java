package com.ignite.algorithm.searching.pattern;

import java.util.Arrays;

/**
 * Uses brute force approach of going through all the characters available in text
 * Best Case : Occurs if first character is not present in string at all, O(n)
 * Worst Case: When all characters are same / last character differs O(m*(n- m + 1))
 */
public class NaivePatternSearch {

    public static void main(String[] args) {
        search("ABAA".toCharArray(), "AABAAABAAAAAAA".toCharArray());
    }

    public static void search(char[] pattern, char[] text) {
        int patternLength = pattern.length;
        int textLength = text.length;

        for(int i = 0 ; i < textLength - patternLength; i++) {
            int j;
            for(j = 0 ; j < patternLength; j++) {
                if(text[i + j]!=pattern[j])
                    break;
            }
            if(j == patternLength) {
                System.out.printf("Pattern %s found at index: %s%n", Arrays.toString(pattern), i);
            }
        }
    }
}
