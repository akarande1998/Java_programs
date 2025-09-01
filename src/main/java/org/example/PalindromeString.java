package org.example;

public class PalindromeString {
    public static String palindromeString(String test){
         char [] test2=test.toCharArray();
          int left=0;
          int right=test.length()-1;

          while(left<right){
             char temp=test2[left];
             test2[left]=test2[right];
             test2[right]=temp;
             left++;
             right--;
          }
          String test1=new String(test2);
          if(test.equals(test1)){
              return "String is palindrome";
          }else{
              return "String is not palindrome";
          }
    }
    public static void main(String[] args) {
        String input="nayan";

        System.out.println("input "+input);

        String output=palindromeString(input);

        System.out.println("output "+output);
    }
}
