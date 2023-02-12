package com.company;
import java.util.Locale;
import java.util.Scanner;
public class UperToLower {
    public static Scanner sc;
    public static void main(String[] args) {
        String uppStr;
        sc = new Scanner(System.in);
        System.out.println("Enter uppercase string to convert= ");
        uppStr = sc.nextLine();
        String uppStr2 = uppStr.toLowerCase();
        System.out.println("The Lowercase String = " +uppStr2);
    }
}
