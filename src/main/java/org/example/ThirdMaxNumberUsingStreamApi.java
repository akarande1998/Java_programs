package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ThirdMaxNumberUsingStreamApi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,41,323);

        Optional<Integer> first = list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();

        if(first.isPresent()){
            System.out.println(first.get());
        }
    }
}
