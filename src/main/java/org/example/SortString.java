package org.example;

public class SortString {
    public static String sortString(String test){
        char[] test1=test.toCharArray();

        for(int i=0;i<test1.length-1;i++){
            for(int j=1;j<test1.length-1;j++){
                if(test1[j]>test1[j+1]){
                    char temp=test1[j];
                    test1[j]=test1[j+1];
                    test1[j+1]=temp;
                }
            }
        }
        return new String(test1);
    }
    public static void main(String[] args) {
        String test="Ankush";
        System.out.println("input "+test);
        String ouput=sortString(test);
        System.out.println("ouput "+ouput);
    }
}
