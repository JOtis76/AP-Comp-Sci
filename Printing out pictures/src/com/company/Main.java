package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String faceboi = "i want a face wym";
        String tictac = "play some tic tac toe";
        String knowledge = "i need some knowledge";

        System.out.println("What you want my guy");

        Scanner Phrase = new Scanner(System.in);
        String Phrasee = Phrase.nextLine().toLowerCase();

        if (Phrasee.equals(faceboi)){
            System.out.println("Aight bruh let me draw you somethin");

            Thread.sleep(10000);

            System.out.println("    ^^^^^^^^^^^^    ");
            System.out.println("  //            \\  ");
            System.out.println(" //   __    __   \\");
            System.out.println("||    U     U     ||");
            System.out.println("||       <        ||");
            System.out.println("||     _____ )    ||");
            System.out.println(" \\              //");
            System.out.println("   \\___(_(____//  ");
            System.out.println("");
            System.out.println("This took me a bit so you better like it");
        }

        if (Phrasee.equals(tictac)) {
            System.out.println("your move");

            System.out.println("       |       |       ");
            System.out.println("       |       |       ");
            System.out.println("_______|_______|_______");
            System.out.println("       |       |       ");
            System.out.println("       |   x   |       ");
            System.out.println("_______|_______|_______");
            System.out.println("       |       |       ");
            System.out.println("       |       |       ");
            System.out.println("       |       |       ");
        }

        if (Phrasee.equals(knowledge)) {
            System.out.println("imma lay some sick knowledge on to you real quick");

            System.out.println(" ________________");
            System.out.println("|                |");
            System.out.println("|   knowledge    |");
            System.out.println("|       is       |");
            System.out.println("|      power     |");
            System.out.println("|________________|");

        }
    }
}
