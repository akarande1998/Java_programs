package org.example;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static Map<Character,Integer> frequencyOfChar(String test){
        Map<Character,Integer> map =new HashMap<>();

        char[] test2=test.toCharArray();

        for(char c:test2){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        String input="test";
        System.out.println("input "+input);
        Map<Character,Integer> ouput=frequencyOfChar(input);
        for(Map.Entry<Character,Integer> map:ouput.entrySet()){
            System.out.println("frequency of "+map.getKey()+" is "+map.getValue());
        }
    }
}
