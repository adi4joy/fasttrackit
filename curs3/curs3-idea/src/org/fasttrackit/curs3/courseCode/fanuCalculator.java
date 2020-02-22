package org.fasttrackit.curs3;

public class fanuCalculator {
    public static void main(String[] args) {
        int suma = add(2, 3);
        System.out.println(suma);

        int diferenta = sub(3, 4);
        System.out.println(diferenta);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
