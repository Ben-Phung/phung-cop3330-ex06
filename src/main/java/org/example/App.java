/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Calendar;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int intAge, intrAge;

        // Prompt user
        System.out.println( "What is your current age? " );
        String age = scan.nextLine();

        System.out.println( "At what age would you like to retire? " );
        String retireAge = scan.nextLine();

        // Get integer value of current year using Calendar object
        int year = Calendar.getInstance().get(Calendar.YEAR);

        // Convert age and retire age to integers from strings
        intAge = Integer.parseInt(age);
        intrAge = Integer.parseInt(retireAge);


        System.out.println( "You have "+(intrAge-intAge)+" years left until you can retire." );
        System.out.println( "It's, "+year+" so you can retire in "+(year + (intrAge-intAge))+"." );
    }
}
