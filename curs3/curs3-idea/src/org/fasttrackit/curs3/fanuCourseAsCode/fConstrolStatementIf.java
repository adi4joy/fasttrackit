package org.fasttrackit.curs3;

import java.util.Scanner;

public class fConstrolStatementIf {
    public static void main(String[] args) {
        System.out.println("Control Statement : IF");

        Scanner valueReader = new Scanner(System.in);
        System.out.print("a=");
        int a = valueReader.nextInt();
        System.out.print("b=");
        int b = valueReader.nextInt();
        if (a == b) {
            System.out.println("a is equal to b");
        }

        if (a > 1) {
            System.out.println("a is greater than 1");
        } else {
            System.out.println("a is NOT greater than 1");
        }

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is smaller than b");
        }
    }
}
