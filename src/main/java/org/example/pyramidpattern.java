package org.example;

public class pyramidpattern {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int f=0;f<=i;f++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
