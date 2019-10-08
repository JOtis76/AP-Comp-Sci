package com.company;

import java.util.Scanner;

public class Temperature {

    public static void main() {
        Scanner input = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.println("Enter the fahrenheit");

        fahrenheit = input.nextDouble();

        celsius = ((fahrenheit - 32) * (5.0/9.0));

        System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius.");
    }
}
