package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class chunkcode {
    public static void main(String[] args) {
        List<Integer> input= Arrays.asList(1,3,4,5,6,77,7);
        chunk_code(input,3);

    }

    private static void chunk_code(List<Integer> input, int chunk) {
        for(int i=0;i<input.size()-1;i+=chunk) {
            List<Integer> list = input.subList(i, Math.min(i + chunk, input.size()));
           // System.out.println(list);

        }

        List<List<Integer>> list = IntStream.range(0, input.size()).filter(i -> i % chunk == 0).mapToObj(value -> input.subList(value, Math.min(value + chunk, input.size()))).toList();

        list.forEach(integers -> System.out.print(integers+","));

    }
}
