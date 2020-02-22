package org.fasttrackit.curs3.homework;

import java.util.Scanner;

public class ATMHomework {
    public static void main(String[] args) {
        int pinNumber = 1979;
        int moneyTotal = 9000;

        System.out.println("Please write your PIN:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (pinNumber == input) {
            isPinOK(moneyTotal, scanner);
        } else {
            System.out.println("Failed! Your PIN is incorrect. The application will now close.");
        }
    }
    public static void isPinOK(int moneyTotal, Scanner scn) {
        System.out.println("Success! Your PIN is correct.");
        System.out.println("How much money would you like to withdraw?");
        int moneyWanted = scn.nextInt();
        if (moneyWanted <= moneyTotal) {
            System.out.println("Success! Your remaining balance is " + (moneyTotal - moneyWanted) + ".");
        } else {
            System.out.println("Failed! Your maximum withdrawal amount is " + (moneyTotal) + ".");
        }
    }
}
