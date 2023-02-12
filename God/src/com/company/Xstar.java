package com.company;
import java.util.Scanner;
public class Xstar {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows= ");
        int r = sc.nextInt();
        for(i=0;i<r;i++){
            for(j=0;j<r;j++){
                if(i==j || i+j == r-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
