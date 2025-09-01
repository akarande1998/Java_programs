package org.example;

import java.util.Arrays;

public class MisssingNumberSecond {
    public static int missingNumber(int arr[]) {
        Arrays.sort(arr);
        int length = arr.length - 1;

        int start = arr[0];

        int end = arr[length];
        int a = 0;
        while (a < arr.length) {
            for (int i = start; i < end; i++) {
                if (arr[a] != i) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={10,13,14,15};

        int output=missingNumber(arr);

        System.out.println("output "+output);
    }

}
