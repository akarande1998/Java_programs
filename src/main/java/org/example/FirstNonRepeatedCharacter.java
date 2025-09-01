package org.example;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input="AnkushA";

        Optional<Character> output=input.chars().mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue()==1).
                map(characterLongEntry -> characterLongEntry.getKey()).findFirst();

        if(output.isPresent()){
            System.out.println(output.get());
        }

    }
}
