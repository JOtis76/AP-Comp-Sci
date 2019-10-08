package com.company;

import java.util.Scanner;

//Generates random numbers within a chosen range
public class Random {
    static void main() {

        Scanner input = new Scanner(System.in);
        float min, max, range;

        System.out.println("Enter the range of numbers least to greatest");

        min = input.nextFloat();
        max = input.nextFloat();
        range = ((max - min +1 ) + min);

        System.out.println("Number:" + (range * Math.random() + min));
    }
}
