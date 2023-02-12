package com.company;
import java.util.Scanner;
public class RevTriangle {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows= ");
        int r = sc.nextInt();
        for(i=r;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(+r);
            }
            r--;
            System.out.println( );
        }

    }
}
