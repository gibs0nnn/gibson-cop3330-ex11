package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

//Exchange rate is c_to / c_frame = rate

public class App 
{
    public static void main( String[] args )
    {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many euros are you exchanging: ");
        int euros = scanner.nextInt();
        System.out.print("What is the exchange rate: ");

        //Conversion
        double rate = scanner.nextDouble();
        double conversion = rate * euros;

        //Output
        System.out.println(euros + " euros at an exchange rate of " + rate + " is "
                + "\n" + (Math.round(conversion * 100.0) / 100.0) + " U.S. dollars.");

    }
}
