package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class maxFromListStream {
    public static void main(String[] args) {
        int [] input={1,3,2,5,8,9,1,44,1,2,3};

        Optional<Integer> first = Arrays.stream(input).boxed().max((o1, o2) -> o1.compareTo(o2)).stream().findFirst();
        if(first.isPresent()){
            System.out.println(first.get());
        }

    }
}
