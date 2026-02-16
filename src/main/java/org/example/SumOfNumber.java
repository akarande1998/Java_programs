package org.example;

import java.util.Arrays;

public class SumOfNumber {
    public static void main(String[] args) {
        int [] input={1,3,2,5,8,9,1,44,1,2,3};
        int sum = Arrays.stream(input).boxed().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
