package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // 31 days: January March May July August October December
    // 30 days: April June September November
    // 28 days: February

        Scanner keyboard = new Scanner(System.in);

        int days;
        String monthNames;

        System.out.print("Number of days in month: ");
        days = keyboard.nextInt();

        switch (days) {
            case 31: monthNames = "January March May July August October December";
                    break;
            case 30: monthNames = "April June September November";
                    break;
            case 28: monthNames = "February";
                    break;
            default: monthNames = "There are no months that have exactly " + days + " days.";
                    break;
        }

        System.out.println(monthNames);
    }
}
