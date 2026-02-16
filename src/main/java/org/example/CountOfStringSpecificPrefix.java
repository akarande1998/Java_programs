package org.example;

import java.util.Arrays;
import java.util.List;

public class CountOfStringSpecificPrefix {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        long a = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(a);
    }
}
