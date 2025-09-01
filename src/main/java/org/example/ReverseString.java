package org.example;

public class ReverseString {

    public static String reverseString(String test){
        char [] test1=test.toCharArray();

        int left=0;

        int right=test.length()-1;

        while(left<right){
            char temp=test1[right];
            test1[right]=test1[left];
            test1[left]=temp;

            left++;
            right--;
        }
        return new String(test1);
    }
    public static void main(String[] args) {

        String test="Ankush";

        System.out.println("input :"+test);

        String ouput=reverseString(test);

        System.out.println("output: "+ouput);

    }
}
