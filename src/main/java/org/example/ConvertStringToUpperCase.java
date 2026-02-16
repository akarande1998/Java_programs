package org.example;

import java.util.Arrays;
import java.util.List;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api");
        List<String> list = names.stream().map(s -> s.toUpperCase()).toList();
        list.forEach(System.out::println);

        String [] name={"java","Stream","api"};

        Arrays.stream(name).map(s -> s.toUpperCase()).forEach(s -> System.out.print(s+","));
    }
}
