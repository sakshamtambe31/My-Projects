package com.company;
import java.util.Scanner;
public class AlphaTriangle {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows= ");
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)(i+64));
            }
            System.out.println( );
        }
    }
}
