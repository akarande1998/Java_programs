package org.example;

import java.util.Arrays;

public class TwoSum {
    static int [] twoSum(int[] arr, int target){
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            // For each element arr[i], check every
            // other element arr[j] that comes after it
            for (int j = i + 1; j < n; j++) {

                // Check if the sum of the current pair
                // equals the target
                if (arr[i] + arr[j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        // If no pair is found after checking
        // all possibilities
        return new int[]{};
    }

    public static void main(String[] args){

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

       Arrays.stream(twoSum(arr, target)).boxed().forEach(System.out::print);
    }
}
