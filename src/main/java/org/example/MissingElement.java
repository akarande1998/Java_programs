package org.example;

public class MissingElement {
    public static int missingNumber(int [] arr){
        int n=arr.length+1;
        int expSum=n*(n+1)/2;
        int actualSum=0;
        for (int i=0;i<arr.length;i++){
            actualSum+=arr[i];
        }

        return expSum-actualSum;
    }
    public static void main(String[] args) {
    int [] a={10,9,8,5,6};

    int output=missingNumber(a);

        System.out.println("output "+output);
    }
}
