package org.fasttrackit.curs3;

import java.util.Scanner;

public class fanuUseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul termen: ");
        int a = scanner.nextInt();
        System.out.print("Introduceti al 2-lea termen: ");
        int b = scanner.nextInt();
        System.out.print("Rezultatul este: ");
        System.out.println(sum(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
