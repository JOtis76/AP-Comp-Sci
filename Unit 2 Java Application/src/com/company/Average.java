package com.company;


import java.util.Scanner;

public class Average {

    public static void main(){

        //The three values that are entered
        int x, y, z;
        //The average of the three values
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("What numbers would you like to average? \n (Enter three values)");

        //Makes the values equal to the inputs
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();

        //Calculates the average
        average = ((x + y + z)/3);

        System.out.println("The average of " + x + ", " + y + ", and " + z + " is " + average);

    }

}
