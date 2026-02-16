package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class secondhighestfromarray {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};

        Optional<Integer> first = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        first.ifPresent(System.out::println);
    }
}
