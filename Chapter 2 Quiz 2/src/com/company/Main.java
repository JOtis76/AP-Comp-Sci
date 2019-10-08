package com.company;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        final double BURGER = 2.99;
        final double FRIES = 1.49;
        final double SHAKE = .99;
        final double TAX = 0.065;

        int burger, fries, shake;
        double subtotal, tax, total, tendered, change;

        Scanner order = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //Krusty Customer orders
        System.out.println("Welcome to Krusty Burger! May I take your order?");
        System.out.println("\nEnter the number of Krusty Burgers");
        burger = order.nextInt();

        System.out.println("\nEnter the number of Bacon Balls");
        fries = order.nextInt();

        System.out.println("\nEnter the number of Krusty-Partially-Gelatinated-Non-Dairy-Gum-Based-Beverages");
        shake = order.nextInt();

        //Cash due
        subtotal = (burger * BURGER) + (fries * FRIES) + (shake * SHAKE);
        tax = TAX * subtotal;
        total = subtotal + tax;

        System.out.println("\nSubtotal: " + money.format(subtotal));
        System.out.println("Tax: " + money.format(tax));
        System.out.println("Total: " + money.format(total));

        //Cashier's Change
        System.out.println("Enter the amount tenderedL:");
        tendered = order.nextDouble();
        change = tendered - total;

        System.out.println("Change: " + money.format(change));

    }
}
