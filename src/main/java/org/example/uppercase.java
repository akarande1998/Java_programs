package org.example;

import java.util.Arrays;
import java.util.List;

public class uppercase {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("ankush", "aaa", "aaa");
        List<String> result = list.stream()
                .map(String::toUpperCase)
                .toList();

        result.forEach(s -> System.out.println(s));
    }
}
