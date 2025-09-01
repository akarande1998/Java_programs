package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacterStream {
    public static void main(String[] args) {
        String input = "Ankush";

      /*  Map<Character, Long> output1 = input.chars().
                mapToObj(value -> (char) value).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         output1.entrySet().forEach(System.out::println);*/

        Map<String ,Long> output=Arrays.asList(input).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        output.entrySet().forEach(System.out::println);
    }
}
