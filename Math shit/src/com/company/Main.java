package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();

        double x1, x2, y1, y2, a, b, c, d, distance;

        System.out.println("Enter the 1st and 2nd x's");
        x1 = i;
        x2 = i;
        a = (x1 - x2);

        System.out.println("Enter the first and 2nd y's");
        y1 = i;
        y2 = i;
        b = (y1 - y2);

        c = Math.pow(a, 2);
        d = Math.pow(b, 2);

        distance = Math.sqrt(c + d);

        System.out.println("The distance between (" + (int)x1 + ", " + (int)y1 + ") and (" + (int)x2 + ", " + (int)y2 + ") is: " + distance);

        System.out.println("bruh");

        double r, volume, sarea;

        r = i;

        volume = ((4/3) * Math.PI * r);
        sarea = (4 * Math.PI * r);


    }
}
