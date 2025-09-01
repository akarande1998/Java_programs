package org.example;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFromArray {

    public static Set<Integer> duplicateArry(int [] test){
        Set<Integer> distinct =new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();
        for(int a:test) {
            if (!distinct.add(a)){
                duplicate.add(a);
            }
        }
        return duplicate;
    }
    public static void main(String[] args) {
        int [] a={1,2,3,1,4,6,7,5,6};
        Set<Integer> output=duplicateArry(a);
        System.out.println("output "+output);
    }
}
