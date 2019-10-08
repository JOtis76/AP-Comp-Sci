package com.company;

import java.util.Scanner;

public class DecimalCombine {
    //Sums, Subtracts, and Multiplies decimal numbers
    static void main(){

        Scanner input = new Scanner(System.in);

        //These are the two values input by the user
        double x, y;
        //The outputs of each math equation
        double sum, difference, product;
        String peepo;


        System.out.println("Enter two numbers.");

        x = input.nextDouble();
        y = input.nextDouble();


        System.out.println("Do you want to add, subtract or multiply?");

        peepo = input.next();

        switch (peepo){

            case "add":
            sum = (x + y);
            System.out.println("the sum of " + x + " and " + y + " is " + sum);
            break;

            case "subtract":
                difference= (x - y);
                System.out.println("the difference of " + x + " and " + y + " is " + difference);
                break;

            case "multiply":
                product = (x * y);
                System.out.println("the product of " + x + " and " + y + " is " + product);
                break;
        }

    }
}
