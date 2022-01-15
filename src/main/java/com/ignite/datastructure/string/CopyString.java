package com.ignite.datastructure.string;

public class CopyString {

    /**
     * Iterative approach to copy string from one to another
     * @param str1 The char array to copy from
     * @param str2 The char array to copy to
     */
    public static void copyIterative(char str1[], char str2[]) {
        for(int i = 0 ; i < str1.length; i++) {
            str2[i] = str1[i];
        }
    }

    public static void copyRecursive(char str1[], char str2[], int index) {
        str2[index] = str1[index];

        if(str1.length == index + 1) return;
        index = index + 1;
        copyRecursive(str1, str2, index);
    }

    public static void main(String[] args) {
        char str1[] = "HelloWorld".toCharArray();
        char str2[] = new char[10];

        copyIterative(str1, str2);
        System.out.println(str2);

        char str3[] = new char[10];
        copyRecursive(str1,  str2, 0);
        System.out.println(str2);
    }
}
