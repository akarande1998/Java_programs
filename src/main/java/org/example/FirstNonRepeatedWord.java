package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedWord {
    public static String firstNonRepeatedChar(String test){
        Map<Character,Integer> map=new LinkedHashMap();
        char[] test1=test.toCharArray();

        for(char c:test1){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return "first non repeated char "+ entry.getKey();

            }
        }
        return "no non repeated char";
    }
    public static void main(String[] args) {
        String input="AnkuAsh";
        System.out.println("input "+input);
        String output=firstNonRepeatedChar(input);
        System.out.println("output "+output);
    }
}
