package com.company;
import java.util.Scanner;
public class Temprature {
    public static void main(String[] args) {
        float fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature in celcius= ");
        float celsius = sc.nextFloat();
        fahrenheit = (float)((celsius)*(1.8)+(32));
        System.out.printf("%.2f degree in fahrenheit is %,2f\n",celsius,fahrenheit);
    }
}
