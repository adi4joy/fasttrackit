package org.fasttrackit.curs3;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String word = scanner.next();
//        String word = scanner.nextLine();

//        System.out.println(word);

        System.out.print("Introduceti primul termen: ");
        int a = scanner.nextInt();

        System.out.print("Introduceti al doilea termen: ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Rezultatul este: " + sum);
    }

}
