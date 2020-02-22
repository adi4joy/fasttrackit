package org.fasttrackit.curs3.homework;

import java.util.Scanner;

public class TaxHomework {
    public static void main(String[] args) {
        System.out.println("Please enter your salary:");
        Scanner scanner = new Scanner(System.in);
        int salaryValue = scanner.nextInt();
        int a = 1500;
        int b = 3000;
        if(salaryValue<=a) {
            System.out.println("You are poor, so your tax is only 15%");
        } else if(salaryValue>a && salaryValue<=b) {
            System.out.println("You are the average guy, so your tax is 25%");
        }else if(salaryValue>b) {
            System.out.println("You are rich, so your tax is 35%");
        } else {
            System.out.println("No salary, no tax.");
        }
    }
}


