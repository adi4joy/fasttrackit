package org.fasttrackit.curs2;

public class ArithmeticOperators {
    public static void main(String[] args) {
        learnAddition();
        learnSubtraction();
        learnMultiplication();
        learnDivision();
        learnConcatenation();
    }

    public static void learnConcatenation() {
        String first = "Hello ";
        String second = "World";
        String phrase = first + second;
        System.out.println(phrase);
        System.out.println(phrase + 5);

        int a = 3;
        System.out.println();

    }

    public static void learnDivision() {
        int a = 9;
        int b = 4;
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public static void learnMultiplication() {
        int a = 5;
        int b = 7;
        int c = a * b;
        System.out.println(c);
    }

    public static void learnSubtraction() {
        int a = 10;
        int b = 5;
        System.out.println(a - b);
    }

    public static void learnAddition() {
        int a = 1;
        int b = 3;
        int c = a + b;
        System.out.println(c);

        int d = 3 + 2;
        System.out.println(d);
        int e = d + 2;
        System.out.println(e);

        byte liveOnTheEdge = 127;
    }
}
