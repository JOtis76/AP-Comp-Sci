package com.company;

import java.util.Scanner;

public class Distance {

    public static void main() {
        Scanner input = new Scanner(System.in);

        double miles, kilometers;

        System.out.println("Enters the number of miles to convert");

        miles = input.nextDouble();

        kilometers = (miles * 1.60395);

        System.out.println(miles + " miles is " + kilometers + " kilometers.");
    }
}
