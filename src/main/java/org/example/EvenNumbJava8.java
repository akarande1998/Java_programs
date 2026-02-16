package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbJava8 {
    public static void main(String[] args) {
        int [] input={1,3,2,4,567,43,5,7,6,8,44};

        List<Integer> integerStream = Arrays.stream(input).boxed().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        String output=integerStream.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(output);
    }
}
