package org.example;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortArrayStreamApi {
    public static void main(String[] args) {
        int [] input={1,3,2,5,8,9,1,44,1,2,3};
        List<Integer> array = Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        array.forEach(x -> System.out.print(x + " "));

    }

}
