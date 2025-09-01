package org.example;

public class BinarySearch {
    public static int binarySearch(int[] test,int n,int value){
     int low =0;
     int high=n;

     while(low<=high) {
         int mid = low + (high - low) / 2;
         if (test[mid] == value) {
             return mid;
         } else if (test[mid] < value)
             low=mid +1;
         else if (test[mid] > value) {
             high=mid -1;
         }
     }
return -1;
    }
    public static void main(String[] args) {
     int [] test={1,2,3,4,5,6};

     int output=binarySearch(test,test.length-1,4);

        System.out.println("output "+output);
    }
}
