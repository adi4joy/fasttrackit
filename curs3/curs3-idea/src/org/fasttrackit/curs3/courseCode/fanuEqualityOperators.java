package org.fasttrackit.curs3;

public class fanuEqualityOperators {
    public static void main(String[] args) {
        equalityOperator();
        notEqualOperator();
    }

    public static void equalityOperator() {
        System.out.println("Testing ==");
        int a = 1;
        int b = 2;

        System.out.println(a == b);
    }

    public static void notEqualOperator() {
        System.out.println("Testing !=");
        int a = 1;
        int b = 2;
        System.out.println(a != b);
    }


}
