package org.example;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharStream {
    public static void main(String[] args) {
        String input = "swiss";

        Optional<Character> any = input.chars().mapToObj(value -> (char) value).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() > 1)
                .map(characterLongEntry -> characterLongEntry.getKey()).findAny();
        if(any.isPresent()){
            System.out.println(any.get());
        }
    }
}
