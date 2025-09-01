package org.example;

import java.util.Arrays;

public class RatateArrayByK {
    public static int [] rotateArrayByK(int [] test,int k){
       int n =test.length;
       k=k%n;
       reverse(test,0,n-1);
       reverse(test,0,k-1);
       reverse(test,k,n-1);
       return test;
    }

    public static void reverse(int [] a,int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7};

        int [] b=rotateArrayByK(a,3);


        for(int c:b) {
            System.out.print(c+" ");
        }
    }
}
