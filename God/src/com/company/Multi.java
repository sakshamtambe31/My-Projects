package com.company;
import java.util.Scanner;
public class Multi {
    public static void main(String[] args) {
        int i,j,k=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows= ");
        int r = sc.nextInt();
        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                System.out.print( k+ " ");
                k++;
            }
            System.out.println();
        }
    }
}