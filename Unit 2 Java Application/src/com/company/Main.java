package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n\nChoose one of the options: \n 1: Average 3 whole numbers \n 2: Add, subtract, and multiply 2 decimal numbers \n 3: Convert fahrenheit to celsius" +
                " \n 4: Convert miles to kilometers \n 5: Convert a length of time to seconds \n 6: Randomly generate a number from a selected range");

        int peepo = input.nextInt();

         switch (peepo){
             case 1:
                 Average.main();
                 break;

             case 2:
                 DecimalCombine.main();
                 break;

             case 3:
                 Temperature.main();
                 break;

             case 4:
                 Distance.main();
                 break;

             case 5:
                 Time.main();
                 break;

             case 6:
                 Random.main();
                 break;
         }


    }
}
