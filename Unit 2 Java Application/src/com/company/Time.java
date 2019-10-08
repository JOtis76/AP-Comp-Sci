package com.company;

import java.util.Scanner;

public class Time {

    private static int hour, minute, second;
    private static Scanner input = new Scanner(System.in);

    private static void timeorigin() {
        System.out.println("Enter the number of hours");
        hour = input.nextInt();

        System.out.println("Enter the number of minutes");
        minute = input.nextInt();

        System.out.println("Enter the number of seconds");
        second = input.nextInt();
    }

    public static void main() {

        Time.timeorigin();

        System.out.println("You wanted"+ hour+ "hours"+ minute+ " minutes"+ second+ "seconds to be put into seconds. Is this correct?(Y/N)");
        switch (input.next()){
            case "Y":
                int total_seconds = ((hour * 360) + (minute * 60) + second);
                System.out.println("The seconds are " + total_seconds);

                break;
            case "N":
                Time.timeorigin();
                break;
        }


    }

}
