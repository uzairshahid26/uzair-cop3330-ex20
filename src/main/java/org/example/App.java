/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int amount;
        double totalAmount = 0.0, tax = 0.0;
        System.out.print("What is the order amount? ");
        amount = scanner.nextInt();
        System.out.print("What state do you live in? ");
        String state = scanner.next();

        if(state.equals("Wisconsin") || state.equals("WI") || state.equals("wi") || state.equals("wisconsin") ){
            System.out.print("What county do you live in? ");
            String county = scanner.next();

            if(county.equalsIgnoreCase("EauClaire")) {
                tax = (amount*5.005)/100;
                totalAmount = tax + amount;
            }
            else if(county.equalsIgnoreCase("Dunn")) {
                tax = (amount*5.004)/100;
                totalAmount = tax + amount;
            }
            else{
                System.out.println("Please enter correct county.");
            }
        }
        else if(state.equals("Illinois") || state.equals("IL") || state.equals("illinois") || state.equals("il")) {
            tax = (amount*8/100);
            totalAmount = tax + amount;
        }
        else{
            tax = 0.0;
            totalAmount = amount;
        }
        System.out.println("The tax is $"+String.format("%.2f",tax) + "." + "\nThe total is $"+String.format("%.2f",totalAmount) + ".");
    }
}